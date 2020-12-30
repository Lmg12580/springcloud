package com.wangyg.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wangyg.springcloud.common.CommonResult;

public class CustomBlockHandler {

    public static CommonResult handleException(BlockException e){
        return new CommonResult(2020,"global exception1");
    }

    public static CommonResult handleException2(BlockException e){
        return new CommonResult(2020,"global exception2");
    }
}
