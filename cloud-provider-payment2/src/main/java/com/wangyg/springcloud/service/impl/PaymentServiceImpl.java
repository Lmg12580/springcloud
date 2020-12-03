package com.wangyg.springcloud.service.impl;

import com.wangyg.springcloud.dao.PaymentDao;
import com.wangyg.springcloud.entity.Payment;
import com.wangyg.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 支付接口实现类
 *
 * @author wangyg
 * @version 1.0.0
 * @description 支付接口实现类
 * @copyright Copyright © 2020
 */
@Service
public class PaymentServiceImpl implements PaymentService {

	@Resource
	private PaymentDao paymentDao;

	@Override
	public int create(Payment payment) {
		return paymentDao.create(payment);
	}

	@Override
	public Payment getPaymentById(Long id) {
		return paymentDao.getPaymentById(id);
	}
}
