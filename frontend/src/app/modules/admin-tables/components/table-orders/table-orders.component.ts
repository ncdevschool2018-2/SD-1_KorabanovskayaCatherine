import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from "rxjs";
import {BsModalService} from "ngx-bootstrap";

import {Order} from "../../../../model/order";
import {OrderService} from "../../../../services/order.service";
import {Company} from "../../../../model/company";
import {BillingAccount} from "../../../../model/billing-account";

@Component({
  selector: 'app-table-orders',
  templateUrl: './table-orders.component.html',
  styleUrls: ['./table-orders.component.css']
})
export class TableOrdersComponent implements OnInit, OnDestroy {

  public orders: Order[] = [];
  public currentOrder: Order = new Order();

  public currentBillingAccount: BillingAccount = new BillingAccount();
  public currentCompany: Company = new Company();

  private subscriptions: Subscription[] = [];

  constructor(private modalService: BsModalService,
              private orderService: OrderService) { }

  ngOnInit() {
    this.loadOrders();
  }

  public _updateOrders(): void {
    this.loadOrders();
  }

  private loadOrders(): void {
    this.subscriptions.push(
      this.orderService.getOrders().subscribe(orders => {
        this.orders = orders as Order[];
      })
    );
  }

  ngOnDestroy() {
    this.subscriptions.forEach(
      subscription => subscription.unsubscribe()
    );
  }
}
