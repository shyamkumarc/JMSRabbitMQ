package com.shyam.messaging;

import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;

@RestController
public class Controller {
    @Autowired
    private JmsTemplate jmsTemplate;
    @Autowired
    private RabbitTemplate rabbitTemplate;


    @PostMapping("/send")
String hello(@RequestBody String transaction){
    Logger logger = LoggerFactory.getLogger(this.getClass());
    logger.info("Got in " + transaction);
    jmsTemplate.convertAndSend("OrderTransactionQueue", transaction);
    rabbitTemplate.convertAndSend("myQueue", transaction);

    return "Shyam";
}

}
