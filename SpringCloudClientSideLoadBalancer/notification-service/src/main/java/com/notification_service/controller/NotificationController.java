package com.notification_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("notification")
public class NotificationController {

    @GetMapping("send")
    public ResponseEntity<String> sendNotification(){
        return ResponseEntity.ok("Notification sended successfully!.");
    }
}
