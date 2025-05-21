package com.OrderServiceConsumer_Kafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OrderServiceConsumerKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceConsumerKafkaApplication.class, args);
	}


	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

}
