package com.example.api.service;

import com.example.api.model.Article;
import com.example.api.model.Ordre;
import com.example.api.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Iterable<Ordre> getOrders() {
        return orderRepository.findAll();
    }

    public Ordre saveOrder(Ordre order) {
        Ordre savedOrder = orderRepository.save(order);
        return savedOrder;
    }
}
