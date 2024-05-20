package org.example.SpringBootAppOrders.Controller;

import org.example.SpringBootAppOrders.Entity.Order;
import org.example.SpringBootAppOrders.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getMethodName() {
        return ResponseEntity.ok().body(orderService.getOrders());
    }

    @PostMapping("/order")
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        Order create = orderService.createOrders(order);
        return new ResponseEntity<>(create, HttpStatus.CREATED);
    }
}