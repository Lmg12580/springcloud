package com.wangyg.springcloud.controller;

import com.wangyg.springcloud.common.CommonResult;
import com.wangyg.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 订单控制层
 *
 * @author wangyg
 * @version 1.0.0
 * @description 订单控制层
 * @copyright Copyright © 2020
 */
@RestController
@Slf4j
public class OrderController {

	public static final String PAYMENT_URL = "http://CLOUD-PROVIDER-PAYMENT";

	@Resource
	private RestTemplate restTemplate;

	@GetMapping("/consumer/payment/get/{id}")
	public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
		return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
	}
}
