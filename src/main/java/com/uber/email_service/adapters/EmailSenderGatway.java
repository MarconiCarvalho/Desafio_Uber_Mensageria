package com.uber.email_service.adapters;

public interface EmailSenderGatway {

    void sendEmail(String to, String subject, String body);
}
