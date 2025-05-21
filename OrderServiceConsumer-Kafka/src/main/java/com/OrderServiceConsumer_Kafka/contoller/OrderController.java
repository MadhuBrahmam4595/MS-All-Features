package com.OrderServiceConsumer_Kafka.contoller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/test")
    @Operation(summary = "Test endpoint", description = "Health check endpoint for the order service")
    public String test() {
        return "Order Service Running...";
    }
}
