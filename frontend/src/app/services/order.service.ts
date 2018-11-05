import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Order} from "../model/order";


@Injectable({
  providedIn: 'root'
})
export class OrderService {

  constructor(private http: HttpClient) {}

  getOrders(): Observable<Order[]> {
    return this.http.get<Order[]>('/api/orders');
  }

  saveOrder(order: Order): Observable<Order> {
    return this.http.post<Order>('/api/orders', order);
  }

  deleteOrder(orderId: string): Observable<void> {
    return this.http.delete<void>('/api/orders/' + orderId);
  }
}
