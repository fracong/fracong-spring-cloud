package com.fracong.manage.hessian;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

import com.fracong.hessian.test.HessianTestInterface;

@Configuration
public class HessianClientConfig {
	@Bean
	public HessianProxyFactoryBean helloClient() {
		HessianProxyFactoryBean factory = new HessianProxyFactoryBean();
		factory.setServiceUrl("http://localhost:8889/fracong-service/testHessian");
		factory.setServiceInterface(HessianTestInterface.class);
		return factory;
	}
}
