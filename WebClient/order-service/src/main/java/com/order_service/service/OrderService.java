package com.order_service.service;

import com.order_service.config.WebClientConfig;
import com.order_service.model.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final WebClient webClient;

    public Mono<Users> getUserById(String userId){
        return webClient.get().uri("users/{id}", userId).retrieve().bodyToMono(Users.class);
    }
}
