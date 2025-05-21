package com.order_service_producer.controller;

import com.order_service_producer.entity.Orders;
import com.order_service_producer.service.OrderService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    @Operation(summary = "Place a new Order", description = "Creates an order based on a product id and quantity")
    public ResponseEntity<Orders> placeOrder(@RequestParam Long productId, @RequestParam int quantity){
        return ResponseEntity.ok(orderService.placeOrder(productId, quantity));
    }
}
