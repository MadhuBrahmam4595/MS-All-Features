package com.notification_service.controller;

import com.netflix.spectator.impl.PatternExpr;
import com.notification_service.model.OrderRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("notification")
public class NotificationController {

    @PostMapping("send")
    public String sendNotification(@RequestBody OrderRequest order){
        System.out.println("Sending email to " + order.getCustEmail()
                + " for order: " + order.getOrderId()
                + ", item: " + order.getItem());
        return "Notification sent successfully!";
    }
}
