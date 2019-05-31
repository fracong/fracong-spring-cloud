package com.fracong.manage.test.service;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fracong.manage.test.controller.MyTestController;
import com.fracong.test.dao.TestMapper;
import com.fracong.test.entity.Test;
import com.fracong.util.constant.ConstantUtil;
import com.fracong.util.zk.ZkConfig;

@Service
public class TestService {
	@Autowired
	private TestMapper testMapper;
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private MyTestController myTestController;
	
	@Autowired
    private KafkaTemplate<String, String> template;

	public Test test(String id) {
		Test test = testMapper.selectByPrimaryKey(id);
		return test;
	}
	
	public Test testRestTemplate(String id){
		Test test = restTemplate.getForObject("http://localhost:8889/fracong-service/mytest/test/"+id, Test.class);
		return test;
	}
	
	public String testFeign(String id){
		String test = myTestController.testFeign();
		return test;
	}
	
	@Cacheable(value=ConstantUtil.FRACONG_EH_CACHE_NAME,key="#id")
	public Test testEhCacheQ(String id){
		System.err.println(id);
		Test test = testMapper.selectByPrimaryKey(id);
		return test;
	}

	public String testKafka(String id) {
		template.send(ConstantUtil.FRACONG_KAFKA_TOPIC, id);
		return "ok";
	}
	
	/**
	 * 查询单个配置的值
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public String testConfig(String param) throws Exception{
		Map<String, String> allParams = ZkConfig.getAllParams();
		Set<String> keySet = allParams.keySet();
		for (String string : keySet) {
			System.err.println(string+"->"+allParams.get(string));
		}
		String singleParams = ZkConfig.getSingleParams(param);
		return singleParams;
	}
	
	/**
	 * 将本地配置写入zk
	 * @return
	 * @throws Exception
	 */
	public String updateConfig() throws Exception{
		 ZkConfig.readConfigDataToZk();
		 return "ok";
	 }
}
