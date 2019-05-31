package com.fracong.util.resource;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ResourceUtil {

	public static String getConfigSingleParam(String path, String param) throws Exception {
		Properties properties = readAllPropertie(path);
		Map<String, String> map = composeParams(properties);
		String server = map.get(param);
		return server;
	}
	
	@SuppressWarnings("rawtypes")
	public static Map<String, String> composeParams(Properties props) {
		Map<String, String> params = new HashMap<String, String>();
		Enumeration e = props.propertyNames();
		while (e.hasMoreElements()) {
			String key = (String) e.nextElement();
			String value = props.getProperty(key);
			params.put(key, value);
		}
		return params;
	}
	
	public static Properties readAllPropertie(String path) throws Exception{
		Properties props = new Properties();
		props.load(ResourceUtil.class.getResourceAsStream(path));
		return props;
	}
	
}
