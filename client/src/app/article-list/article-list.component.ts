import { Component, OnInit } from '@angular/core';
import { Article } from 'src/models/article.model';
import { ArticleService } from 'src/services/article.service';

@Component({
  selector: 'app-article-list',
  templateUrl: './article-list.component.html',
  styleUrls: ['./article-list.component.css']
})
export class ArticleListComponent implements OnInit {
   
  articles! : Article[];
  constructor(private articleService : ArticleService) { }

  ngOnInit(): void {
    
      this.articleService.getArticles().subscribe( data => {
        this.articles = data;
      });
  
    
    
  }

  
  
  

}
