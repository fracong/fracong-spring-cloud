package com.fracong.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SessionConfig implements WebMvcConfigurer{
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new SessionIterceptor())
		.addPathPatterns("/**")
		.excludePathPatterns("/user/login")
		.excludePathPatterns("/user/checkLogin");
	}
}
