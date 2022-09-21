package com.example.api.repository;

import com.example.api.model.Article;
import com.example.api.model.Ordre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Ordre,Long> {
}
