package com.wangyg.springcloud.controller;

import com.wangyg.springcloud.common.CommonResult;
import com.wangyg.springcloud.entity.Payment;
import com.wangyg.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 订单Feign控制层
 *
 * @author wangyg
 * @version 1.0.0
 * @description 订单Feign控制层
 * @copyright Copyright ©️ 2020
 */
@RestController
@Slf4j
public class OrderFeignController {

	@Resource
	private PaymentFeignService paymentFeignService;

	@GetMapping("/consumer/payment/get/{id}")
	public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
		return paymentFeignService.getPaymentById(id);
	}

	@GetMapping(value = "/consumer/payment/feign/timeout")
	public String paymentFeignTimeout(){
		// openfeign客户端，默认等待1秒
		return paymentFeignService.paymentFeignTimeout();
	}
}
