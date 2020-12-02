package com.wangyg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka服务第二个节点
 *
 * @author wangyg
 * @version 1.0.0
 * @description eureka服务第二个节点
 * @copyright Copyright ©️ 2020
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication2.class, args);
	}
}
