package com.wangyg.springcloud.controller;

import com.wangyg.springcloud.common.CommonResult;
import com.wangyg.springcloud.entity.Payment;
import com.wangyg.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 支付控制层
 *
 * @author wangyg
 * @version 1.0.0
 * @description 支付控制层
 * @copyright Copyright © 2020
 */
@RestController
@Slf4j
public class PaymentController {

	@Resource
	private PaymentService paymentService;

	@Value("${server.port}")
	private String serverPort;

	@GetMapping("/payment/lb")
	public String getPaymentLB(){
		return serverPort;
	}

	@GetMapping("/payment/get/{id}")
	public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
		Payment payment = paymentService.getPaymentById(id);
		if (payment != null) {
			log.info("查询成功,serverPort: " + serverPort + payment);
			return new CommonResult(200, "查询成功,serverPort: " + serverPort, payment);
		} else {
			return new CommonResult(500, "没有对应记录，查询id:" + id, null);
		}
	}

	@PostMapping("/payment/create")
	public CommonResult<Payment> create(@RequestBody Payment payment) {
		int result = paymentService.create(payment);
		log.info("插入结果：" + result);

		if (result > 0) {
			return new CommonResult(200, "插入成功,serverPort: " + serverPort, result);
		} else {
			return new CommonResult(500, "插入失败", result);
		}
	}

	@GetMapping(value = "/payment/feign/timeout")
	public String paymentFeignTimeout(){
		try { Thread.sleep(3000); } catch (Exception e) { e.printStackTrace(); }
		return serverPort;
	}
}
