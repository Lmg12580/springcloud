package com.wangyg.springcloud.alibaba.controller;

import com.wangyg.springcloud.alibaba.service.StorageService;
import com.wangyg.springcloud.common.CommonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count){
        storageService.decrease(productId, count);
        return new CommonResult(200,"库存扣减成功！");
    }
}
