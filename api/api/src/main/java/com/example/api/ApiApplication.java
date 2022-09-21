package com.example.api;

import com.example.api.model.Article;
import com.example.api.model.Ordre;
import com.example.api.service.ArticleService;
import com.example.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Autowired
	private OrderService orderService;

	@Autowired
	private ArticleService articleService;



//	@Bean
//	CommandLineRunner run() {
//		return args -> {
//			Article article =new Article(null,"hasna",100,"farah");
//			articleService.saveArticle(article);
//			List<Article> articles = new ArrayList<>();
//			articles.add(article);
//			Ordre order =new Ordre(null,null,articles);
//			orderService.saveOrder(order);
//
//		};
//	}

}
