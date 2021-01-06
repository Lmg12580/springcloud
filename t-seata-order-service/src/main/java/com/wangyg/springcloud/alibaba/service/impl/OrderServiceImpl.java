package com.wangyg.springcloud.alibaba.service.impl;

import com.wangyg.springcloud.alibaba.dao.OrderDao;
import com.wangyg.springcloud.alibaba.domain.Order;
import com.wangyg.springcloud.alibaba.service.AccountService;
import com.wangyg.springcloud.alibaba.service.OrderService;
import com.wangyg.springcloud.alibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;

    @Override
    @GlobalTransactional
    public void create(Order order) {
        log.info("---新建订单--->");
        orderDao.create(order);

        log.info("---订单微服务开始调用库存，做扣减Count--->");
        storageService.decrease(order.getProductId(), order.getCount());

        log.info("---订单微服务开始调用账户，做扣减Money--->");
        accountService.decrease(order.getUserId(), order.getMoney());

        log.info("---修改订单状态--->");
        orderDao.update(order.getUserId(), 0);

        log.info("下单成功(^_^)v");
    }
}
