package com.user_service.controller;

import com.user_service.model.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping("/{id}")
    public Mono<Users> getUserById(@PathVariable String id){
        return Mono.just(new Users(id, "madhu brahmam", "brahmam.madhu1@gmail.com"));
    }
}
