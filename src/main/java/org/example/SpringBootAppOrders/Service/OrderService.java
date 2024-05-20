package org.example.SpringBootAppOrders.Service;

import org.example.SpringBootAppOrders.Entity.Order;
import org.example.SpringBootAppOrders.Repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    public Order createOrders(Order o) {
        return orderRepository.save(o);
    }

}
