package com.wangyg.springcloud.alibaba.controller;

import com.wangyg.springcloud.alibaba.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serviceURL;

    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(
                serviceURL + "/payment/nacos/" + id,
                String.class);
    }

    // =====openfeign======
    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "/getPayment/{id}")
    public String getPayment(@PathVariable("id") Integer id){
        return paymentService.getPayment(id);
    }
}
