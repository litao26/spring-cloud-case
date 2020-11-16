package com.xuetao.springcloud.service;

import com.xuetao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentServiceImp
 * @Description TODO
 * @Author EDZ
 * @DaTe 2020/11/9 19:51
 * @Version 1.0
 **/
public interface PaymentService {

    /**
     * 查询
     *
     * @param payment 平台账户ID
     * @return 平台账户
     */
    public int create(Payment payment);

    /**
     * 获取
     *
     * @param id id
     * @return Payment
     */
    public Payment getPaymentById(@Param("id")Long id);
}
