package com.wangyg.springcloud.alibaba.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentService{

    @Override
    public String getPayment(Integer id) {
        String result = "--- getPayment fallback---";
        return result;
    }
}
