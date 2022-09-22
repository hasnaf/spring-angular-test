package com.example.api.controller;

import com.example.api.model.Article;
import com.example.api.repository.ArticleRepository;
import com.example.api.repository.OrderRepository;
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

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ArticleRepository articleRepository;
    @PostMapping("/articless")
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


    @PostMapping("/orders/{orderId}/articles")
    public Optional<Article> createArticle(@PathVariable (value = "orderId") Long orderId,
                                                @RequestBody Article article) {
        return orderRepository.findById(orderId).map(order -> {
            article.setOrder(order);
            return articleRepository.save(article);
        });
    }

    @DeleteMapping("/orders/{orderId}/articles/{articleId}")
    public Optional<ResponseEntity<Object>> deleteArticle(@PathVariable (value = "orderId") Long orderId,
                                                            @PathVariable (value = "articleId") Long articleId) {
        return articleRepository.findByIdAndOrderId(articleId, orderId).map(article -> {
            articleRepository.delete(article);
            return ResponseEntity.ok().build();
        });
//            .orElseThrow(() -> new ResourceNotFoundException("Comment not found with id " + commentId + " and postId " + postId));
    }


}
