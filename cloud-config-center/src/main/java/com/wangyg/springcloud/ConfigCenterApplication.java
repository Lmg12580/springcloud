package com.wangyg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心主启动类
 *
 * @author wangyg
 * @version 1.0.0
 * @description 配置中心主启动类
 * @createTime 2020/12/10
 * @copyright Copyright ©️ 2020 北京魔马科技
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigCenterApplication.class, args);
	}
}
