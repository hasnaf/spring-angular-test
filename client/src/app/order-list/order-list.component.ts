import { Component, OnInit } from '@angular/core';
import { Order } from 'src/models/order.model';
import { OrderService } from 'src/services/order.service';

@Component({
  selector: 'app-order-list',
  templateUrl: './order-list.component.html',
  styleUrls: ['./order-list.component.css']
})
export class OrderListComponent implements OnInit {
  orders! : Order[];
  constructor(private orderService :OrderService) { }

  ngOnInit(): void {
    this.orderService.getOrders().subscribe( data => {
      this.orders = data;
    });
  }

}
