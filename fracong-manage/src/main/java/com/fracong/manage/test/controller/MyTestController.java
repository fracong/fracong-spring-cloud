package com.fracong.manage.test.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="fracong-service", path="${feign.param.path.com.fracong.service}")
public interface MyTestController {
	
	@RequestMapping(value = "/mytest/testFeign",method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public String testFeign();
}
