import { Injectable } from "@angular/core";
import { HttpClient, HttpErrorResponse } from "@angular/common/http";
import { catchError, map, Observable, throwError } from "rxjs";
import { Article } from "src/models/article.model";


@Injectable({
    providedIn: "root"
  })
export class ArticleService {
    constructor(private http: HttpClient) {}
    private articlesUrl2 = "http://localhost:9090/api/articless";
    private articlesUrl1 = "http://localhost:9090/api/articles";
  getArticles(): Observable<Article[]> {
    return this.http.get<Article[]>(this.articlesUrl1)
  }

//   getArticleById(payload: number): Observable<Article> {
//     return this.http.get<Article>(`${this.offersUrl4}/${payload}`);
//   }

  addArticle(data: any): Observable<any> /*Observable<any>*/ {
    //offer.id = null;
    return this.http.post<any>(this.articlesUrl2, data).pipe(map((res:any)=>{
        return res;
    }
    ))
      
  }
}
