package com.ProductServiceProvider_Kafka.controller;

import com.ProductServiceProvider_Kafka.entity.Orders;
import com.ProductServiceProvider_Kafka.service.OrderService;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    @Operation(summary = "Create order and send to kafka topic")
    public ResponseEntity<Orders> createOrder(@RequestBody Orders orders) throws JsonProcessingException {
        Orders andSendOrder = orderService.createAndSendOrder(orders);
        return ResponseEntity.ok(andSendOrder);
    }


    @GetMapping("/test")
    public String test() {
        return "Producer Service Running...";
    }


}
