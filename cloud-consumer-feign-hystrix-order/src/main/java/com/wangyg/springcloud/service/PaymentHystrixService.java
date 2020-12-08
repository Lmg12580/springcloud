package com.wangyg.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 调用支付服务feign接口
 *
 * @author wangyg
 * @version 1.0.0
 * @description 调用支付服务feign接口
 * @copyright Copyright ©️ 2020
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = PaymentFallbackService.class)
public interface PaymentHystrixService {

	@GetMapping("/payment/hystrix/timeout/{id}")
	String paymentInfoTimeOut(@PathVariable("id") Integer id);
}
