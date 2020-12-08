package com.wangyg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 订单hystrix主启动类
 *
 * @author wangyg
 * @version 1.0.0
 * @description 订单hystrix主启动类
 * @copyright Copyright ©️ 2020
 */
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class OrderHystrixApplication {
	public static void main(String[] args) {
		SpringApplication.run(OrderHystrixApplication.class, args);
	}
}
