package org.example.SpringBootAppOrders.Repo;

import org.example.SpringBootAppOrders.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}

