package com.wangyg.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate配置类
 *
 * @author wangyg
 * @version 1.0.0
 * @description RestTemplate配置类
 * @copyright Copyright ©️ 2020
 */
@Configuration
public class ApplicationContextConfig {

	@Bean
	//@LoadBalanced 临时注释，如需负载均衡则开启
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
