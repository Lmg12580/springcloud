package com.wangyg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 网关服务主启动类
 *
 * @author wangyg
 * @version 1.0.0
 * @description 网关服务主启动类
 * @createTime 2020/12/09
 * @copyright Copyright ©️ 2020 北京魔马科技
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
}
