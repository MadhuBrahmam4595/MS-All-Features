package com.order_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping("/notify")
    public Mono<String> sendNotification() {
        return webClientBuilder.build()
                .get()
                .uri("http://localhost:9090/notification/send")
                .retrieve()
                .bodyToMono(String.class);
    }
}

