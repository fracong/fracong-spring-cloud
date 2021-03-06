package com.fracong.blog.config;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fracong.blog.util.RedisUtil;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class RedisConfig{
	@Value("${blog.cms.redis.host}")
    private String host;
 
    @Value("${blog.cms.redis.port}")
    private int port;
 
    @Value("${blog.cms.redis.timeout}")
    private int timeout;
 
    @Value("${blog.cms.redis.password}")
    private String password;
    
    @Value("${blog.cms.redis.pool.max-active}")
    private int maxActive;

    @Value("${blog.cms.redis.pool.max-idle}")
    private int maxIdle;

    @Value("${blog.cms.redis.pool.min-idle}")
    private int minIdle;

    @Value("${blog.cms.redis.pool.max-wait}")
    private long maxWaitMillis;
 
    @Bean
    public JedisPool redisPoolFactory()  throws Exception{
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(maxIdle);
        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
        jedisPoolConfig.setMaxTotal(maxActive);
        jedisPoolConfig.setMinIdle(minIdle);
        JedisPool jedisPool = new JedisPool(jedisPoolConfig, host, port, timeout, StringUtils.isNotBlank(password)?password:null);
        return jedisPool;
    }
    
    @Bean
    public RedisUtil redisUtil() throws Exception{
    	return new RedisUtil(redisPoolFactory());
    }
}

