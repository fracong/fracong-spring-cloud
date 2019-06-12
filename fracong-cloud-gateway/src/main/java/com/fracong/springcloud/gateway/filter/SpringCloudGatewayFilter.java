package com.fracong.springcloud.gateway.filter;

import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

/**
 * 自定义过滤器
 * @author fracong
 *
 */
public class SpringCloudGatewayFilter implements GatewayFilter, Ordered{
	private static final String fracong_value = "fcfc";

	@Override
	public int getOrder() {
		return 0;
	}

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		//所有的数据都存储在exchange中
		String fracong = exchange.getRequest().getQueryParams().getFirst("fracongfc");
		if(StringUtils.isBlank(fracong) || !fracong_value.equals(fracong)){
			System.out.println("SpringCloudGatewayFilter failed");
			return exchange.getResponse().setComplete();
		}
		System.out.println("SpringCloudGatewayFilter success");
		return chain.filter(exchange);
	}

}
