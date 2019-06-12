package com.fracong.springcloud.gateway.filter;

import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

/**
 * 全局拦截器
 * @author fracong 2019-06-12
 *
 */
@Component
public class SpringCloudGolbalFilter implements GlobalFilter, Ordered {
	private static final String fracong_value = "fc";

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		//所有的数据都存储在exchange中
		String fracong = exchange.getRequest().getQueryParams().getFirst("fracong");
		if(StringUtils.isBlank(fracong) || !fracong_value.equals(fracong)){
			System.out.println("SpringCloudGolbalFilter failed");
			return exchange.getResponse().setComplete();
		}
		System.out.println("SpringCloudGolbalFilter success");
		return chain.filter(exchange);
	}
	
	@Override
    public int getOrder() {//设置过滤器执行的顺序
        return -100;
    }
}
