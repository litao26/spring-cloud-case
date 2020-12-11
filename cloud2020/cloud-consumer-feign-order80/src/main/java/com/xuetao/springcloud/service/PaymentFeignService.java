package com.xuetao.springcloud.service;

import com.xuetao.springcloud.entities.CommonResult;
import com.xuetao.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName PaymentServiceImp
 * @Description TODO
 * @Author EDZ
 * @DaTe 2020/11/9 19:51
 * @Version 1.0
 **/
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    /**
     * 获取
     *
     * @param id id
     * @return Payment
     */
    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id")Long id);

    /**
     * 超时
     * @return String
     */
    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeOut();
}
