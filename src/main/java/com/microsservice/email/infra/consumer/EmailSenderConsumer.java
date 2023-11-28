package com.microsservice.email.infra.consumer;

import com.microsservice.email.core.EmailRequest;
import com.microsservice.email.infra.service.RabbitMQEmailSender;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailSenderConsumer {

    @Autowired
    RabbitMQEmailSender emailService;

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload EmailRequest emailRequest) {
        emailService.sendEmail(emailRequest.to(), emailRequest.subject(),emailRequest.body());
    }
}