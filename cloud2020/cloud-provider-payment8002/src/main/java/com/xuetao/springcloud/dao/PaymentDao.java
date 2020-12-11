package com.xuetao.springcloud.dao;

import com.xuetao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentDao
 * @Description 主启动类
 * @Author 李涛
 * @DaTe 2020/11/9 16:11
 * @Version 1.0
 **/
@Mapper
public interface PaymentDao {

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
