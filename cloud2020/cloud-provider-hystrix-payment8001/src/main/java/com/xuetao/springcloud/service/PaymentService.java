package com.xuetao.springcloud.service;

import org.springframework.web.bind.annotation.PathVariable;

public interface PaymentService {
    /**
     * 正常访问
     */
    String paymentInfo_OK(Integer id);

    /**
     * 正常访问
     */
    String paymentInfo_TimeOut(Integer id);

    String paymentCircuitBreaker(@PathVariable("id") Integer id);
}
