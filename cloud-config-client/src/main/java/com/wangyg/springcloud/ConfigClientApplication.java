package com.wangyg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Config客户端主启动类
 *
 * @author wangyg
 * @version 1.0.0
 * @description Config客户端主启动类
 * @copyright Copyright ©️ 2020
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
}
