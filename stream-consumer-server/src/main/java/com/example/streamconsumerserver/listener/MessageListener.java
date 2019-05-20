package com.example.streamconsumerserver.listener;


import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Sink.class)
public class MessageListener {

    //开启一个输入管道监听
    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        System.err.println("【*** 消息接收 ***】" + message.getPayload());
    }
}