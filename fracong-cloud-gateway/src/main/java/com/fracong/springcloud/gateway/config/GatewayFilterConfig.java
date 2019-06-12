package com.fracong.springcloud.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fracong.springcloud.gateway.filter.SpringCloudGatewayFilter;

@Configuration
public class GatewayFilterConfig {
	@Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/fracong-manage/**")
                        .filters(f -> f.filter(new SpringCloudGatewayFilter()))
                        .uri("lb://fracong-manage")
                        .order(-99)
                        .id("fracong_gateway_filter")
                )
                .build();
    }
}
