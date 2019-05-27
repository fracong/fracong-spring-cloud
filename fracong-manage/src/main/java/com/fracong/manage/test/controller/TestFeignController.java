package com.fracong.manage.test.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.fracong.manage.config.FooConfiguration;

@FeignClient(name = "fracong-service",configuration=FooConfiguration.class)
public interface TestFeignController {
	
	@GetMapping("/mytest/test/{id}")
	public String test(@PathVariable("id") String id);
}
