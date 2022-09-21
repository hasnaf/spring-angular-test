package com.example.api.controller;


import com.example.api.model.Article;
import com.example.api.model.Ordre;
import com.example.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public Iterable<Ordre> getOrders() {
        return orderService.getOrders();

    }
    @PostMapping("/orders1")
    public Ordre saveOrder(@RequestBody Ordre order)
    {
        return orderService.saveOrder(order);
    }
}
