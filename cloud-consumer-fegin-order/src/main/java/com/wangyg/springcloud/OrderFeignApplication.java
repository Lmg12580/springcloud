package com.wangyg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 订单Fegin主启动类
 *
 * @author wangyg
 * @version 1.0.0
 * @description 订单Fegin主启动类
 * @copyright Copyright ©️ 2020
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderFeignApplication.class, args);
	}
}
