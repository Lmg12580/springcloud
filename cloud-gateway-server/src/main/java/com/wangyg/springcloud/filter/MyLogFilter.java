package com.wangyg.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * 自定义过滤器
 *
 * @author wangyg
 * @version 1.0.0
 * @description 自定义过滤器
 * @copyright Copyright ©️ 2020
 */
@Component
@Slf4j
public class MyLogFilter implements GlobalFilter, Ordered {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		log.info("come in MyLogFilter:"+ new Date());
		String name = exchange.getRequest().getQueryParams().getFirst("name");
		if (name == null){
			log.info("*****用户名为空，非法用户******");
			exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
			return exchange.getResponse().setComplete();
		}
		return chain.filter(exchange);
	}

	@Override
	public int getOrder() {
		//返回值代表加载过滤器的顺序，值越小，优先级越低
		return 0;
	}
}
