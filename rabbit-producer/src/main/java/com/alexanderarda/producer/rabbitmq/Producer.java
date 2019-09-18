package com.alexanderarda.producer.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(String message) {

        // routing key = "hello"
        rabbitTemplate.convertAndSend("hello", message);

    }

}
