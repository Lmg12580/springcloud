package com.wangyg.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * fallback处理
 *
 * @author wangyg
 * @version 1.0.0
 * @description fallback处理
 * @copyright Copyright ©️ 2020
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{

	@Override
	public String paymentInfoTimeOut(Integer id) {
		return "PaymentFallbackService fallback";
	}
}
