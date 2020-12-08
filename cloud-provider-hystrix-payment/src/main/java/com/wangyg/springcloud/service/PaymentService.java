package com.wangyg.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

/**
 * 支付服务接口
 *
 * @author wangyg
 * @version 1.0.0
 * @description 支付服务接口
 * @copyright Copyright ©️ 2020
 */
@Service
public class PaymentService {

	/**
	 * 让方法休眠几秒
	 * @param id
	 * @return
	 */
	@HystrixCommand(fallbackMethod = "paymentInfoTimeOutHandler", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
	})
	public String paymentInfoTimeOut(Integer id) {
		try { Thread.sleep(3000); } catch (Exception e) { e.printStackTrace(); }
		return "线程池：" + Thread.currentThread().getName() + " paymentInfoTimeOut,id:" + id + " :)";
	}

	public String paymentInfoTimeOutHandler(Integer id) {
		return "线程池：" + Thread.currentThread().getName() + " 系统繁忙，请稍后再试,id:" + id + " :(";
	}

	/**
	 * 服务熔断
	 * @param id
	 * @return
	 */
	@HystrixCommand(fallbackMethod = "paymentCircuitBreakerFallback",commandProperties = {
			@HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//是否开启断路器
			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//请求次数
			@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//时间窗口期
			@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")//失败率达到多少后跳闸
	})
	public String paymentCircuitBreaker(Integer id){
		if (id < 0){
			throw new RuntimeException("id不能为负数");
		}
		String serialNumber = IdUtil.simpleUUID();
		return Thread.currentThread().getName()+ "\t"+"调用成功，流水号："+serialNumber;
	}
	public String paymentCircuitBreakerFallback(Integer id){
		return "id不能为负数，请重试～  id："+id;
	}
}
