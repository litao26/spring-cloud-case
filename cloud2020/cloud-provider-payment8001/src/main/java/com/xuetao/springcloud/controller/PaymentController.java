package com.xuetao.springcloud.controller;

import com.xuetao.springcloud.entities.CommonResult;
import com.xuetao.springcloud.entities.Payment;
import com.xuetao.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author EDZ
 * @DaTe 2020/11/10 10:49
 * @Version 1.0
 **/
@Slf4j
@RestController
public class PaymentController {

    @Resource
    public PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult<Integer> create(Payment payment){
        int result = paymentService.create(payment);
        log.info("*****插入结果:" + result);
        if(result > 0) {
          return new CommonResult<>(200, "插入成功", result);
        }
        return new CommonResult<>(999, "插入失败", null);
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****插入结果:" + payment);
        if(payment !=null) {
            return new CommonResult<>(200, "查询成功", payment);
        }
        return new CommonResult<Payment>(999, "没有对应记录", null);
    }
}
