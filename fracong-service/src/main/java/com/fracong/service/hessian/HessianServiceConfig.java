package com.fracong.service.hessian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;

import com.fracong.hessian.test.HessianTestInterface;

@Configuration
public class HessianServiceConfig {
	@Autowired
	private HessianTestService hessianTestService;

	/**
	 * 1. HessianServiceExporter是由Spring.web框架提供的Hessian工具类，能够将bean转化为Hessian服务
     * 2. @Bean(name = "/testHessian")加斜杠方式会被spring暴露服务路径,发布服务。
	 * @return
	 */
	@Bean(name="/testHessian")
	public HessianServiceExporter testHessian(){
		HessianServiceExporter exporter = new HessianServiceExporter();
		exporter.setService(hessianTestService);
		exporter.setServiceInterface(HessianTestInterface.class);
		return exporter;
	}
}
