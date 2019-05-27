package com.fracong.manage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Contract;

@Configuration
public class FooConfiguration {
	@Bean
    public Contract feignContract() {
        //这将SpringMvc Contract 替换为feign.Contract.Default
        return new feign.Contract.Default();
    }
}
