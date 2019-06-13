package com.fracong.shardingjdbc.config;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.dangdang.ddframe.rdb.sharding.api.ShardingDataSourceFactory;
import com.dangdang.ddframe.rdb.sharding.api.rule.BindingTableRule;
import com.dangdang.ddframe.rdb.sharding.api.rule.DataSourceRule;
import com.dangdang.ddframe.rdb.sharding.api.rule.ShardingRule;
import com.dangdang.ddframe.rdb.sharding.api.rule.TableRule;
import com.dangdang.ddframe.rdb.sharding.api.strategy.database.DatabaseShardingStrategy;
import com.dangdang.ddframe.rdb.sharding.api.strategy.table.TableShardingStrategy;

@Configuration
//sqlSessionTemplateRef的说明：扫描出来的接口类，使用的SqlSessionTemplate是哪一个SqlSessionTemplate
@MapperScan(basePackages = "com.fracong.shardingjdbc.**.dao", sqlSessionTemplateRef  = "shardingJdbcSqlSessionTemplate")
public class MybatisConfig {

	@Bean(name="dataSource0")
    @ConfigurationProperties(prefix = "spring.datasource.fracongtest")
    public DataSource dataSource0(){
        return DataSourceBuilder.create().build();
    }
	
	@Bean(name="dataSource1")
    @ConfigurationProperties(prefix = "spring.datasource.fracongtest1")
    public DataSource dataSource1(){
        return DataSourceBuilder.create().build();
    }
	
	/**
	 * 设置分库映射 设置默认库:当一张表不需要进行分表分库的时候，只在一个数据库中存在，那这张表必须在默认数据库中
	 * @param dataSource0
	 * @param dataSource1
	 * @return
	 */
	@Bean
    public DataSourceRule dataSourceRule(@Qualifier("dataSource0") DataSource dataSource0,
                                         @Qualifier("dataSource1") DataSource dataSource1){
        Map<String, DataSource> dataSourceMap = new HashMap<>();
        dataSourceMap.put("dataSource0", dataSource0);
        dataSourceMap.put("dataSource1", dataSource1);
        return new DataSourceRule(dataSourceMap, "dataSource0");
    }
	
	/**
	 * 具体分库分表策略
	 * @param dataSourceRule
	 * @return
	 */
	@Bean
    public ShardingRule shardingRule(DataSourceRule dataSourceRule){
        TableRule userTableRule = TableRule.builder("tab_test_user")
                .actualTables(Arrays.asList("tab_test_user_0", "tab_test_user_1"))
                .tableShardingStrategy(new TableShardingStrategy("id", new DemoTableShardingAlgorithm()))
                .dataSourceRule(dataSourceRule)
                .build();

        //绑定表策略，在查询时会使用主表策略计算路由的数据源，因此需要约定绑定表策略的表的规则需要一致，可以一定程度提高效率
        List<BindingTableRule> bindingTableRules = new ArrayList<BindingTableRule>();
        bindingTableRules.add(new BindingTableRule(Arrays.asList(userTableRule)));//说明：如果有多张表需要分表分库，那么改成多加几个Rule
        return ShardingRule.builder()
                .dataSourceRule(dataSourceRule)
                .tableRules(Arrays.asList(userTableRule))//说明：如果有多张表需要分表分库，那么改成多加几个Rule
                .bindingTableRules(bindingTableRules)
                .databaseShardingStrategy(new DatabaseShardingStrategy("sex", new DemoDatabaseShardingAlgorithm()))
                .tableShardingStrategy(new TableShardingStrategy("id", new DemoTableShardingAlgorithm()))
                .build();
    }

    /**
     * 创建数据源DataSource
     * @param shardingRule
     * @return
     * @throws SQLException
     */
    @Bean(name="shardingDataSource")
    public DataSource shardingDataSource(ShardingRule shardingRule) throws SQLException {
        return ShardingDataSourceFactory.createDataSource(shardingRule);
    }
    
    /**
     * SqlSessionFactory 可以设置走mybatis-config.xml文件，默认不需要走
     * 使用实例：
     * ------------
     * @Autowired
	 * @Qualifier("shardingJdbcSqlSessionFactory")
	 *  private SqlSessionFactory sqlSessionFactory;
	 *  
	 *  SqlSession session = sqlSessionFactory.openSession();
	 *	session.getConnection().setAutoCommit(false);
	 * -----------------
     * @param dataSource
     * @return
     * @throws Exception
     */
    @Bean(name = "shardingJdbcSqlSessionFactory")
    @Primary
    public SqlSessionFactory shardingJdbcSqlSessionFactory(@Qualifier("shardingDataSource") DataSource dataSource) throws Exception {
    	SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
    	bean.setDataSource(dataSource);
    	//bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/*.xml"));
    	return bean.getObject();
    }

    /**
     * 需要手动配置事务管理器
     * 使用：在具体的service方法上添加注解@Transactional("shardingJdbcTransactionManager") 即可
     * @param dataSource
     * @return
     */
    @Bean(name = "shardingJdbcTransactionManager")
    public DataSourceTransactionManager shardingJdbcTransactionManager(@Qualifier("shardingDataSource") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "shardingJdbcSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate shardingJdbcSqlSessionTemplate(@Qualifier("shardingJdbcSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
