package com.example.api.controller;


import com.example.api.model.Ordre;
import com.example.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public Iterable<Ordre> getOrders() {
        return orderService.getOrders();

    }
}
