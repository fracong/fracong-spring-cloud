package com.fracong.manage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.kristofa.brave.Brave;
import com.github.kristofa.brave.http.DefaultSpanNameProvider;
import com.github.kristofa.brave.okhttp.BraveOkHttpRequestResponseInterceptor;

import okhttp3.OkHttpClient;

@Configuration
public class OkHttpClientConfig {
	//设置client的（发起请求和获取到服务端返回信息）拦截器
	@Bean
    public OkHttpClient okHttpClient(Brave brave){
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .addInterceptor(new BraveOkHttpRequestResponseInterceptor(
                        brave.clientRequestInterceptor(),
                        brave.clientResponseInterceptor(), 
                        new DefaultSpanNameProvider())).build();
        return httpClient;
    }
}
