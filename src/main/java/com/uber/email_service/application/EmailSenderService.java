package com.uber.email_service.application;

import com.uber.email_service.adapters.EmailSenderGatway;
import com.uber.email_service.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGatway emailSenderGatway;

    @Autowired
    public EmailSenderService(EmailSenderGatway emailGatway){
        this.emailSenderGatway = emailGatway;
    }

    @Override
    public void senderEmail(String to, String subject, String body) {
        this.emailSenderGatway.sendEmail(to, subject, body);
    }



}
