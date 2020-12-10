package com.wangyg.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 通过java代码配置路由
 *
 * @author wangyg
 * @version 1.0.0
 * @description 通过java代码配置路由
 * @copyright Copyright ©️ 2020
 */
@Configuration
public class GatewayConfig {

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
		RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
		routes.route("path_route",
				r -> r.path("/guonei")
						.uri("http://news.baidu.com/guonei")).build();

		return routes.build();
	}
}
