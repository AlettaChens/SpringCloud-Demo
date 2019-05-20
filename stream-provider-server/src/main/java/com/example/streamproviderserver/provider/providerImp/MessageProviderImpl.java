package com.example.streamproviderserver.provider.providerImp;

import com.example.streamproviderserver.provider.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;

@EnableBinding(Source.class) // 可以理解为是一个消息的发送管道的定义
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output; // 消息的发送管道

    @Override
    public void send(String name) {
        this.output.send(MessageBuilder.withPayload(name).build()); // 创建并发送消息
    }
}
