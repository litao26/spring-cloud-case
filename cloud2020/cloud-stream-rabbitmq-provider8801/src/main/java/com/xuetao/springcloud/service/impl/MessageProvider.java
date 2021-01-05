package com.xuetao.springcloud.service.impl;

import com.xuetao.springcloud.service.IMessageProvider;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @ClassName MessageProvider
 * @Description TODO
 * @Author EDZ
 * @DaTe 2020/12/14 11:53
 * @Version 1.0
 **/
@EnableBinding(Source.class) //定义消息的推送管道
public class MessageProvider implements IMessageProvider {

    @Resource
    private MessageChannel output; // 消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial: " + serial);
        return null;
    }
}
