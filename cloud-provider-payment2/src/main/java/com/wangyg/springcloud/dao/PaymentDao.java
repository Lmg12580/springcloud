package com.wangyg.springcloud.dao;

import com.wangyg.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 支付Dao接口类
 *
 * @author wangyg
 * @version 1.0.0
 * @description 支付Dao接口类
 * @copyright Copyright © 2020
 */
@Mapper
public interface PaymentDao {
	int create(Payment payment);
	Payment getPaymentById(@Param("id") Long id);
}
