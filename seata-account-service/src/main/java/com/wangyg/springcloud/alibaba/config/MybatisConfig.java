package com.wangyg.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.wangyg.springcloud.alibaba.dao"})
public class MybatisConfig {
}
