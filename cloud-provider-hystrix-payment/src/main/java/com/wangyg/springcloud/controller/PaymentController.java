package com.wangyg.springcloud.controller;

import com.wangyg.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 支付服务控制层
 *
 * @author wangyg
 * @version 1.0.0
 * @description 支付服务控制层
 * @copyright Copyright ©️ 2020
 */
@RestController
@Slf4j
public class PaymentController {

	@Resource
	private PaymentService paymentService;

	@GetMapping("/payment/hystrix/timeout/{id}")
	public String paymentInfoTimeOut(@PathVariable("id") Integer id){
		return paymentService.paymentInfoTimeOut(id);
	}

	@GetMapping("/payment/circuit/{id}")
	public String paymentCircuitBreaker(@PathVariable("id") Integer id){
		return paymentService.paymentCircuitBreaker(id);
	}
}
