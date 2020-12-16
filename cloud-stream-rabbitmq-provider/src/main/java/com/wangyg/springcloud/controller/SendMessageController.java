package com.wangyg.springcloud.controller;

import com.wangyg.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SendMessageController {
    @Resource
    private IMessageProvider messageProducer;

    @GetMapping("/send")
    public void sendMsg(){
        messageProducer.send();
    }
}
