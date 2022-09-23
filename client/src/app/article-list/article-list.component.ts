import { Component, OnInit } from '@angular/core';
import { Article } from 'src/models/article.model';
import { Order } from 'src/models/order.model';
import { ArticleService } from 'src/services/article.service';
import { OrderService } from 'src/services/order.service';

@Component({
  selector: 'app-article-list',
  templateUrl: './article-list.component.html',
  styleUrls: ['./article-list.component.css']
})
export class ArticleListComponent implements OnInit {
   order !: Order;
  articles! : Article[];
  constructor(private articleService : ArticleService, private orderService:OrderService) { }

  ngOnInit(): void {
    
      this.articleService.getArticles().subscribe( data => {
        this.articles = data;
      });
  
 
    
  }
  addOrder(article : Article){
    console.log(article);
    const newOrder: Order = {
      articles:  [article],
      id: 0,
      
    };
    console.log(newOrder);
    this.orderService.addOrder(newOrder).subscribe(res => {
      console.log(res);
    })
   }

  
  
  

}


