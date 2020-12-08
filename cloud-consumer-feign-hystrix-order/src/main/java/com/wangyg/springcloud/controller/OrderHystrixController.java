package com.wangyg.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.wangyg.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 订单控制层
 *
 * @author wangyg
 * @version 1.0.0
 * @description 订单控制层
 * @createTime 2020/12/08
 * @copyright Copyright ©️ 2020 北京魔马科技
 */
@RestController
@DefaultProperties(defaultFallback = "globalFallBack")
@Slf4j
public class OrderHystrixController {

	@Resource
	private PaymentHystrixService paymentHystrixService;

	@GetMapping("/consumer/hystrix/timeout/{id}")
	@HystrixCommand(fallbackMethod = "paymentInfoTimeOutFallback", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")
	})
	public String paymentInfoTimeOut(@PathVariable("id") Integer id){
		return paymentHystrixService.paymentInfoTimeOut(id);
	}

	@GetMapping("/consumer/hystrix/global_timeout/{id}")
	@HystrixCommand
	public String paymentInfoTimeOutGlobal(@PathVariable("id") Integer id){
		return paymentHystrixService.paymentInfoTimeOut(id);
	}

	public String paymentInfoTimeOutFallback(Integer id) {
		return "系统繁忙，请稍后再试,id:" + id + " :(";
	}

	public String globalFallBack(){
		return "Global全局异常处理信息，请稍后再试～";
	}
}
