package com.fracong.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;

@SpringBootApplication
@ComponentScan("com.fracong")
@EnableDiscoveryClient
@EnableFeignClients
//@EnableCreateCacheAnnotation用于自定义缓存，使@CreateCache注解的bean生效
@EnableCreateCacheAnnotation
//@EnableMethodCache基于方法的缓存，使@Cached注解的方法生效
@EnableMethodCache(basePackages = "com.fracong.manage.test.service")
public class ManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageApplication.class, args);
	}
}
