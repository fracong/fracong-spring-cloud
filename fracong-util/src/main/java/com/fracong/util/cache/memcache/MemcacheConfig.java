package com.fracong.util.cache.memcache;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.whalin.MemCached.MemCachedClient;
import com.whalin.MemCached.SockIOPool;

@Configuration
@ConditionalOnProperty(name="fracong.memcache.servers")
//只有配置文件fracong.memcache.servers存在时，该配置才会生效
public class MemcacheConfig {
	@Value("${fracong.memcache.servers}")
    private String[] servers;
    @Value("${fracong.memcache.failover}")
    private boolean failover;
    @Value("${fracong.memcache.initConn}")
    private int initConn;
    @Value("${fracong.memcache.minConn}")
    private int minConn;
    @Value("${fracong.memcache.maxConn}")
    private int maxConn;
    @Value("${fracong.memcache.maintSleep}")
    private int maintSleep;
    @Value("${fracong.memcache.nagle}")
    private boolean nagel;
    @Value("${fracong.memcache.socketTO}")
    private int socketTO;
    @Value("${fracong.memcache.aliveCheck}")
    private boolean aliveCheck;
	
	@Bean
    public SockIOPool sockIOPool () {
        SockIOPool pool = SockIOPool.getInstance();
        pool.setServers(servers);
        pool.setFailover(failover);
        pool.setInitConn(initConn);
        pool.setMinConn(minConn);
        pool.setMaxConn(maxConn);
        pool.setMaintSleep(maintSleep);
        pool.setNagle(nagel);
        pool.setSocketTO(socketTO);
        pool.setAliveCheck(aliveCheck);
        pool.initialize();
        System.out.println("init memcache");
        return pool;
    }

    @Bean
    public MemCachedClient memCachedClient(){
        return new MemCachedClient();
    }
}
