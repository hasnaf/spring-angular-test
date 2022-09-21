package com.example.api.repository;

import com.example.api.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {
    List<Article> findByOrderId(Long orderId);
    Optional<Article> findByIdAndOrderId(Long id, Long orderId);
}
