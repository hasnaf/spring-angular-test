import { Injectable } from "@angular/core";
import { HttpClient, HttpErrorResponse } from "@angular/common/http";
import { catchError, map, Observable, throwError } from "rxjs";
import { Order } from "src/models/order.model";



@Injectable({
    providedIn: "root"
  })
export class OrderService {
    constructor(private http: HttpClient) {}
    private articlesUrl2 = "http://localhost:8080/api/articless";
    private ordersUrl1 = "http://localhost:8080/api/orders";
  getOrders(): Observable<Order[]> {
    return this.http.get<Order[]>(this.ordersUrl1)
  }

//   getArticleById(payload: number): Observable<Article> {
//     return this.http.get<Article>(`${this.offersUrl4}/${payload}`);
//   }

//   addArticle(data: any): Observable<any> /*Observable<any>*/ {
//     //offer.id = null;
//     return this.http.post<any>(this.articlesUrl2, data).pipe(map((res:any)=>{
//         return res;
//     }
//     ))
      
//   }
}