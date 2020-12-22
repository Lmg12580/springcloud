package com.wangyg.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApp2 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApp2.class, args);
    }
}
