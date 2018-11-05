import {Component, OnDestroy, OnInit, TemplateRef} from '@angular/core';
import {OrderStatus} from "../../../../model/enums/sub-state";
import {Order} from "../../../../model/order";
import {CompanySubscription} from "../../../../model/company-subscription";
import {BsModalRef, BsModalService} from "ngx-bootstrap";
import {Subscription} from "rxjs";
import {OrderService} from "../../../../services/order.service";
import {forEach} from "@angular/router/src/utils/collection";

@Component({
  selector: 'app-order-editor',
  templateUrl: './order-editor.component.html',
  styleUrls: ['./order-editor.component.css']
})
export class OrderEditorComponent implements OnInit, OnDestroy {

  public currentState: OrderStatus = OrderStatus.ACTIVE;
  public states: OrderStatus[] = [
    OrderStatus.ALL,
    OrderStatus.ACTIVE,
    OrderStatus.SUSPENDED,
    OrderStatus.COMPLETED
  ];

  public orders: FullOrder[] = [];
  public currentOrder: FullOrder = new FullOrder();

  public modalRef: BsModalRef;

  private subscriptions: Subscription[] = [];

  constructor(private modalService: BsModalService,
              private orderService: OrderService) { }

  ngOnInit() {
    this.loadOrders();
  }

  public _closeModal(): void {
    this.modalRef.hide();
  }

  public _openModal(template: TemplateRef<any>, order: FullOrder): void {
    this.currentOrder = order;
    this.modalRef = this.modalService.show(template);
  }

  public _setCompanySubscriptions(state: OrderStatus): void {
    this.currentState = state;
    switch (state) {
      case OrderStatus.ALL: {
        // TODO: отбор подписок по статусу
        break;
      }
      //...
    }
  }

  public _updateOrders(): void {

  }

  private loadOrders() {

  }

  ngOnDestroy(): void {
  }

}

class FullOrder {
  order: Order;
  subscription: CompanySubscription;
}
