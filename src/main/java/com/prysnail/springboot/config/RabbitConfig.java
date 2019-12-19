package com.prysnail.springboot.config;

import com.rabbitmq.client.AMQP;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitMQ配置类
 * @author prysnail
 * @date 2019/12/19 12:10
 */
@Configuration
public class RabbitConfig {

    public static final String QUEUE_HELLO = "hello";

    @Bean
    public Queue helloQueue(){
        return new Queue(QUEUE_HELLO);
    }
}
