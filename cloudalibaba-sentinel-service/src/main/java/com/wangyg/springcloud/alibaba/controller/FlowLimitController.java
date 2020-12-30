package com.wangyg.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wangyg.springcloud.alibaba.myhandler.CustomBlockHandler;
import com.wangyg.springcloud.common.CommonResult;
import com.wangyg.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        log.info("testA 测试熔断降级");
        int a = 10/0;
        return "-----testA-----";
    }

    @GetMapping("/testB")
    public String testB(){
        return "-----testB-----";
    }

    @GetMapping("/testHotkey")
    @SentinelResource(value = "testHotkey", blockHandler = "dealHotkey")
    public String testHotkey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2){
        return "---testHotkey---";
    }

    public String dealHotkey(String p1, String p2, BlockException blockException){
        return "---dealHotkey---";
    }

    // 自定义配置
    @GetMapping("/customBlockHandler")
    @SentinelResource(value = "customBlockHandler",
            blockHandlerClass = CustomBlockHandler.class,
            blockHandler = "handleException2",
            exceptionsToIgnore = { IllegalArgumentException.class }
    )
    public CommonResult customBlockHandler(){
        return new CommonResult(200,"自定义配置",new Payment(2020L,"0001"));
    }
}
