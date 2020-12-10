package com.xuetao.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName OrderZKController
 * @Description TODO
 * @Author EDZ
 * @DaTe 2020/11/23 17:02
 * @Version 1.0
 **/
@RestController
@Slf4j
public class OrderZKController {

    public static final String INVOKE_URL = "";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo() {
        return restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
    }
}
