package com.fracong.service.hessian;

import org.springframework.stereotype.Service;

import com.fracong.hessian.test.HessianTestInterface;

@Service
public class HessianTestService implements HessianTestInterface{
	@Override
	public String sayTest(String str) {
		return "service-"+str;
	}
}
