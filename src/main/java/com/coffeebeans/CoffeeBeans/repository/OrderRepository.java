package com.coffeebeans.CoffeeBeans.repository;

import com.coffeebeans.CoffeeBeans.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
