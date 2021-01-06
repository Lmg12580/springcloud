package com.wangyg.springcloud.alibaba.service.impl;

import com.wangyg.springcloud.alibaba.dao.AccountDao;
import com.wangyg.springcloud.alibaba.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        //模拟超时异常，测试全局事务是否生效
        //try{ Thread.sleep(5000); } catch (Exception e){ e.printStackTrace(); }
        accountDao.decrease(userId,money);
    }
}
