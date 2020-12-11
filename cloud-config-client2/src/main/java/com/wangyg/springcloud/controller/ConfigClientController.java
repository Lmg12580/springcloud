package com.wangyg.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 客户端配置控制层
 *
 * @author wangyg
 * @version 1.0.0
 * @description 客户端配置控制层
 * @copyright Copyright ©️ 2020
 */
@RestController
@RefreshScope
public class ConfigClientController {

	@Value("${config.info}") 
	private String configInfo;

	@GetMapping("/configInfo")
	public String getConfigInfo(){
		return configInfo;
	}
}
