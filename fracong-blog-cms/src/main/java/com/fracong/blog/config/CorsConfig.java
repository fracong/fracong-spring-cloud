package com.fracong.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer{
	@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/user/login")
				.allowedOrigins("*")
				.allowCredentials(true)
				.allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
				.maxAge(3600);
    }
}
