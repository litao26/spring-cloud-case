package com.xuetao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName OrderMain80
 * @Description TODO
 * @Author EDZ
 * @DaTe 2020/11/11 16:00
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
