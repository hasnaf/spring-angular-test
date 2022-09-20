package com.example.api.controller;

import com.example.api.model.Article;
import com.example.api.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @PostMapping("/articles")
    public Article saveArticle(@RequestBody Article article)
    {
        return articleService.saveArticle(article);

    }
    @GetMapping("/articles/{id}")

    public ResponseEntity<Optional<Article>> getArticleById(@PathVariable  long id){
        Optional<Article> article = articleService.getArticle(id);
        return ResponseEntity.ok(article);
    }

    @GetMapping("/articles")
    public Iterable<Article> getArticles() {
        return articleService.getArticles();

    }
}
