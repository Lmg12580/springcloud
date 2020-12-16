package com.wangyg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Stream主启动类
 *
 * @author wangyg
 * @version 1.0.0
 * @description Stream主启动类
 * @copyright Copyright ©️ 2020
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamProviderApplication.class, args);
    }
}

