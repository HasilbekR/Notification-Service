package com.example.notificationservice.service;

import com.example.notificationservice.dto.MailDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootTest
class MailSendingServiceTest {
    private final String message = "Hello, world!";
    private final String email = "hreymbaev@gmail.com";
    @Value("${spring.mail.username}")
    private String sender;
    private MailDto mailDto;
    @MockBean
    private JavaMailSender javaMailSender;
    private MailSendingService mailSendingService;

    @BeforeEach
    private void setUp(){
        mailSendingService = new MailSendingService(javaMailSender);
        mailDto = new MailDto(message, email);
    }

    @Test
    void testSendMessage(){
        mailSendingService.sendMessage(mailDto);
//        verify(javaMailSender, times(1)).send(any(SimpleMailMessage.class));
    }

}