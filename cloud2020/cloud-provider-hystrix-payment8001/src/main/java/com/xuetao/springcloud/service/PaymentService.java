package com.xuetao.springcloud.service;

public interface PaymentService {
    /**
     * 正常访问
     */
    String paymentInfo_OK(Integer id);

    /**
     * 正常访问
     */
    String paymentInfo_TimeOut(Integer id);
}
