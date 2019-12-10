package com.fracong.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement(proxyTargetClass = true)   //开启事物管理功能
public class BlogApllication {
	public static void main(String[] args) throws Exception {
		 SpringApplication.run(BlogApllication.class, args);
	}
}