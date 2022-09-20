package com.example.api.service;

import com.example.api.model.Article;
import com.example.api.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public Article saveArticle(Article article) {
        Article savedArticle = articleRepository.save(article);
        return savedArticle;
    }

    public Optional<Article> getArticle(Long id) {
        Optional<Article> article= articleRepository.findById(id);
        return article;
    }

}
