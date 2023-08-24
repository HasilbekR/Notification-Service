package com.example.notificationservice.controller;

import com.example.notificationservice.dto.MailDto;
import com.example.notificationservice.service.MailSendingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notification")
@RequiredArgsConstructor
public class MailSendingController {

    private final MailSendingService mailSendingService;

    @PostMapping ("/send-single")
    public void sendMessage(
            @RequestBody MailDto mailDto
    ) {
       mailSendingService.sendMessage(mailDto);
    }
}
