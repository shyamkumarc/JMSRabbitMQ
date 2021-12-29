# Getting Started

### Objective

Build a service that has a REST endpoint to accept a message. 
On receving the message, it has to be send to a JMS and RabbitMQ/AMQP queue.

A RabbitMQ listener and JMS listener is configured within this same app that
logs the message it receives.

For rabbitMQ , a local rabbitMQ instance has to be setup for whcih we can
use the docker image :

`docker run -d -p 5672:5672 -p 15672:15672 --name my-rabbit rabbitmq:3-management
`
