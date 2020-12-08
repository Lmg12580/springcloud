package com.wangyg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 支付服务整合hystrix主启动类
 *
 * @author wangyg
 * @version 1.0.0
 * @description 支付服务整合hystrix主启动类
 * @copyright Copyright ©️ 2020
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class PaymentHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentHystrixApplication.class, args);
	}
}
