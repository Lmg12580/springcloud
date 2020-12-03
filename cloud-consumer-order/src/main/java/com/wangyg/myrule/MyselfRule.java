package com.wangyg.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义负载规则
 *
 * @author wangyg
 * @version 1.0.0
 * @description 自定义负载规则
 * @copyright Copyright ©️ 2020
 */
@Configuration
public class MyselfRule {

	@Bean
	public IRule myRule(){
		return new RandomRule(); // 定义为随机
	}
}
