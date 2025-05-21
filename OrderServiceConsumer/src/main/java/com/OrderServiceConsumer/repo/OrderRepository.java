package com.OrderServiceConsumer.repo;

import com.OrderServiceConsumer.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Long> {
}
