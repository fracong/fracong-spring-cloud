package com.fracong.util.date;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpPostUtil {
	
	/**
	 * json的流的形式进行传输
	 * @param data
	 * @param url
	 * @param outTime
	 * @return
	 * @throws Exception
	 */
	public static String httpPost(String data, String url, Integer outTime) throws Exception{
        String result = null;
        CloseableHttpClient client = null;
        HttpPost httpost = null;
        try {
            client = HttpClients.createDefault();
            httpost = new HttpPost(url);
            RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(outTime)
                                                             .setConnectTimeout(outTime).setSocketTimeout(outTime).build();
            httpost.setConfig(requestConfig);
            httpost.addHeader("content-type", "application/json;charset=UTF-8");
            StringEntity entity = new StringEntity(data,"UTF-8");
            httpost.setEntity(entity);
            CloseableHttpResponse response = client.execute(httpost);
            result = EntityUtils.toString(response.getEntity());
        }finally{
            if(httpost!=null){
                httpost.releaseConnection();
            }
        }
        return result;
    }
}
