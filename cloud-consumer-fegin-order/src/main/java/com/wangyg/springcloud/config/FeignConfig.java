package com.wangyg.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * feign日志增强
 *
 * @author wangyg
 * @version 1.0.0
 * @description feign日志增强
 * @copyright Copyright ©️ 2020
 */
@Configuration
public class FeignConfig {

	@Bean
	Logger.Level feignLoggerLevel(){
		return Logger.Level.FULL;
	}
}
