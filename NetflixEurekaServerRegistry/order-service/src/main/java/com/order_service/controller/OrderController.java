package com.order_service.controller;

import com.order_service.model.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("orders")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        String notificationUrl = "http://NOTIFICATION-SERVICE/notification/send";
        restTemplate.postForObject(notificationUrl, orderRequest, String.class);
        return "Order placed and notification sent successfully!";
    }
}
