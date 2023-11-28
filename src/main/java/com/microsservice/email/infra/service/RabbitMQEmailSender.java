package com.microsservice.email.infra.service;

import com.microsservice.email.adapters.EmailSenderGateway;
import com.microsservice.email.core.exceptions.EmailServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class RabbitMQEmailSender implements EmailSenderGateway {

    @Autowired
    private JavaMailSender emailSender;

    @Transactional
    public void sendEmail(String to, String subject, String body) {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(to);
            message.setSubject(subject);
            message.setText(body);

        try{
            emailSender.send(message);
        } catch (MailException exception){
            throw new EmailServiceException("Failure while sending email", exception);
        }
    }

}