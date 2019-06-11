package com.fracong.gateway.zuul.filter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class SecurityFilter extends ZuulFilter {
	private static final String fracong_value = "fc";
	
	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		String fracong = request.getParameter("fracong");
		if(fracong_value.equals(fracong)){
			System.out.println("fracong-success");
			return null;
		}
		System.out.println("fracong-failed");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;// 是否执行该过滤器，此处为true，说明需要过滤
	}

	@Override
	public int filterOrder() {
		return 0; // filter执行顺序，通过数字指定 ,优先级为0，数字越大，优先级越低
	}

	@Override
	public String filterType() {
		return "pre";// 可以在请求被路由之前调用;为post为前置过滤器
	}
}
