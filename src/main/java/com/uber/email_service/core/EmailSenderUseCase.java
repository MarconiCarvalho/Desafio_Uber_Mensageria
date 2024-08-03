package com.uber.email_service.core;

public interface EmailSenderUseCase {
    void senderEmail(String to, String subject, String body);
}
