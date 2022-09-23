import { Injectable } from "@angular/core";
import { HttpClient, HttpErrorResponse } from "@angular/common/http";
import { catchError, map, Observable, throwError } from "rxjs";
import { Order } from "src/models/order.model";



@Injectable({
    providedIn: "root"
  })
export class OrderService {
    constructor(private http: HttpClient) {}
    private ordersUrl2 = "http://localhost:9090/api/orders";
    private ordersUrl1 = "http://localhost:9090/api/orders1";
  getOrders(): Observable<Order[]> {
    return this.http.get<Order[]>(this.ordersUrl2)
  }

//   getArticleById(payload: number): Observable<Article> {
//     return this.http.get<Article>(`${this.offersUrl4}/${payload}`);
//   }

  addOrder(data: any): Observable<any> /*Observable<any>*/ {
    //offer.id = null;
    return this.http.post<any>(this.ordersUrl1, data).pipe(map((res:any)=>{
        return res;
    }
    ))
      
  }
}