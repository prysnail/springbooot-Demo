package com.prysnail.springboot.jmx.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.prysnail.springboot.config.RabbitConfig.QUEUE_HELLO;

/**
 *
 * @author prysnail
 * @date 2019/12/19 12:18
 */
@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        amqpTemplate.convertAndSend(QUEUE_HELLO , "hello,i am prysnail");
    }
}
