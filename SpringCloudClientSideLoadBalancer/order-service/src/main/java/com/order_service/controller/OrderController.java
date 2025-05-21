package com.order_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/order/notify")
    public String sendNotification() {
        String url = "http://NOTIFICATION-SERVICE/notification/send";
         return restTemplate.getForObject(url, String.class);

    }
}
