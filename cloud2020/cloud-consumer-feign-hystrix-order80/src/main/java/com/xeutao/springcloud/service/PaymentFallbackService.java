package com.xeutao.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName PaymentFallbackService
 * @Description TODO
 * @Author EDZ
 * @DaTe 2020/12/11 10:38
 * @Version 1.0
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService flal back paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return  "-----PaymentFallbackService flal back paymentInfo_TimeOut";
    }
}
