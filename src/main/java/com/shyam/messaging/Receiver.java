package com.shyam.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
@RabbitListener(queues = "myQueue")
public void receiveMessage(String transaction) {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    logger.info("Received RabbitMQ:" + transaction );
}

@JmsListener(destination = "OrderTransactionQueue")
public void receiveMessageJMS(String transaction) {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    logger.info("Received JMS:" + transaction );
}
}


