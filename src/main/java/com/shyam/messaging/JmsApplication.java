package com.shyam.messaging;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsApplication.class, args);
	}

	@Bean
	public Queue myQueue() {
		return new Queue("myQueue", false);
	}


}
// JMS reference: https://lankydan.dev/2017/06/18/using-jms-in-spring-boot
// Rabbit MQ/ AMQP reference: https://www.baeldung.com/spring-amqp