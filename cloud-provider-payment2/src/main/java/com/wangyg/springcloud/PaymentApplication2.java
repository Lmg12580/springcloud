package com.wangyg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 支付服务主启动类
 *
 * @author wangyg
 * @version 1.0.0
 * @description 支付服务主启动类
 * @copyright Copyright ©️ 2020
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(PaymentApplication2.class, args);
	}
}
