package com.fracong.util.zk;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.Properties;

import org.I0Itec.zkclient.ZkClient;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fracong.util.resource.ResourceUtil;

public class ZkConfig {
	private static Logger logger = LoggerFactory.getLogger(ZkConfig.class);
	
	private ZkConfig() {}
	private static ZkClient zkClient = null;
	private static final String PERSISTENT_NODE_PATH="/fracong";
	private static ZkConfig zkconfig = new ZkConfig();
	private Map<String, String> params = null;
	private static final String ZK_CONFIG_PATH = "/zk/zk.properties";
	private static final String SYSTEM_CONFIG_PATH = "/conf.properties";
	private static final String ZK_SERVER_KEY = "zookeeper.server";
	
	/**
	 * 获取单个参数
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public static String getSingleParams(String param) throws Exception{
		return getAllParams().get(param);
	}

	/**
	 * 获取配置文件中给所有数据
	 * @return
	 * @throws Exception
	 */
	public static Map<String, String> getAllParams() throws Exception{
		synchronized (zkconfig) {
			if (zkconfig.params == null) {
				zkconfig.readConfig();
			}else{
				System.err.println("不走配置文件");
			}
		}
		return zkconfig.params;
	}
	
	/**
	 * 读取配置文件
	 * @return
	 * @throws Exception
	 */
	private Map<String, String> readConfig() throws Exception {
		Properties props = null;
		if(ifZk()){
			try {
				zkconfig.initZkClient();
				props = (Properties)zkClient.readData(PERSISTENT_NODE_PATH);
				if(props == null){
					props = ResourceUtil.readAllPropertie(SYSTEM_CONFIG_PATH);
					zkClient.writeData(PERSISTENT_NODE_PATH, props);
				}
			} catch (Exception e) {
				props =ResourceUtil.readAllPropertie(SYSTEM_CONFIG_PATH);
				logger.error("no zk");
			}
		}else{
			props =ResourceUtil.readAllPropertie(SYSTEM_CONFIG_PATH);
		}
		zkconfig.params = ResourceUtil.composeParams(props);
		return params;
	}

	/**
	 * 判断是否走ZK
	 * @return
	 * @throws Exception
	 */
	private boolean ifZk() throws Exception{
		String server = ResourceUtil.getConfigSingleParam(ZK_CONFIG_PATH, ZK_SERVER_KEY);
		if(StringUtils.isBlank(server)){
			logger.info("----->init local");
			return false;
		}
		logger.info("----->init zk");
		return true;
	}
	
	/**
	 * 初始化ZkClient
	 * @throws Exception
	 */
	private void initZkClient() throws Exception{
		try {
			String server = ResourceUtil.getConfigSingleParam(ZK_CONFIG_PATH, ZK_SERVER_KEY);
			if(StringUtils.isBlank(server)) throw new Exception();
			zkClient = new ZkClient(server);
			zkClient.createPersistent(PERSISTENT_NODE_PATH, true);
		} catch (Exception e) {
			logger.info("new ZkClient no zk");
			throw new Exception();
		}
	}

	/**
	 * 将数据写入到zookeeper中
	 */
	public static void refreshDataToConfig(JSONArray array) {
		try {
			if(zkClient == null) zkconfig.initZkClient();
			Properties props = new Properties();
			for (int i = 0; i < array.size(); i++) {
				JSONObject o = array.getJSONObject(i);
				String key = o.keySet().iterator().next();
				String value = o.getString(key);
				zkconfig.params.put(key, value);
				props.setProperty(key, value);
			}
			String path = ZkConfig.class.getResource(SYSTEM_CONFIG_PATH).getPath();
			FileOutputStream outputFile = new FileOutputStream(path);
			props.store(outputFile, "modify");
			zkconfig.writePropertiesToZk(props);
		} catch (Exception e) {
			logger.info("reloadConfig error");
		}
	}
	
	/**
	 * 将配置传到zk
	 * 
	 * @param properties
	 */
	private void writePropertiesToZk(Properties properties) {
		try {
			zkClient.writeData(PERSISTENT_NODE_PATH, properties);
		} catch (Exception e) {
			logger.info("no zk");
		}
	}
	
	/**
	 * 将本地文件写入到zk中
	 * @throws Exception
	 */
	public static void readConfigDataToZk() throws Exception {
		if(zkClient == null) zkconfig.initZkClient();
		Properties props = ResourceUtil.readAllPropertie(SYSTEM_CONFIG_PATH);
		zkClient.writeData(PERSISTENT_NODE_PATH, props);
		zkconfig.params = ResourceUtil.composeParams(props);
	}
}
