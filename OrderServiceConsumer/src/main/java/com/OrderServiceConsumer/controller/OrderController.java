package com.OrderServiceConsumer.controller;

import com.OrderServiceConsumer.entity.Orders;
import com.OrderServiceConsumer.service.OrderService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    @Operation(summary = "Place a new order", description = "Creates an order based on a product ID and quantity")
    public ResponseEntity<Orders> placeOrder(@RequestParam Long productId, @RequestParam int quantity) {
        return ResponseEntity.ok(orderService.placeOrder(productId, quantity));
    }

    @GetMapping("/test")
    @Operation(summary = "Test endpoint", description = "Health check endpoint for the order service")
    public String test() {
        return "Order Service Running...";
    }
}
