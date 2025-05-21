package com.OrderServiceConsumer_Kafka.repo;


import com.OrderServiceConsumer_Kafka.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {}
