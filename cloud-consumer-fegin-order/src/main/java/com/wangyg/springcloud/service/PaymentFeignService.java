package com.wangyg.springcloud.service;

import com.wangyg.springcloud.common.CommonResult;
import com.wangyg.springcloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Fegin接口
 *
 * @author wangyg
 * @version 1.0.0
 * @description Fegin接口
 * @copyright Copyright ©️ 2020
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-PAYMENT")
public interface PaymentFeignService {

	@GetMapping("/payment/get/{id}")
	CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}
