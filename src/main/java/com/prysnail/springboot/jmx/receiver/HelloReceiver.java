package com.prysnail.springboot.jmx.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import static com.prysnail.springboot.config.RabbitConfig.QUEUE_HELLO;

/**
 * @author prysnail
 * @date 2019/12/19 12:20
 */
@Component
@RabbitListener(queues = QUEUE_HELLO)
public class HelloReceiver {
    private final static Logger logger = LoggerFactory.getLogger(HelloReceiver.class);

    @RabbitHandler
    public void process(String hello){
        logger.info("Hello Receiver:" + hello);
    }
}
