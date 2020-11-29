package com.wangyg.springcloud.service;

import com.wangyg.springcloud.entity.Payment;

/**
 * 支付service接口
 *
 * @author wangyg
 * @version 1.0.0
 * @description 支付service接口
 * @copyright Copyright © 2020
 */
public interface PaymentService {
	int create(Payment payment);
	Payment getPaymentById(Long id);
}
