
export class Order {

  orderId: string;
  orderStatus: string;
  orderPriceInDay: string;
  orderStartDay: string;
  orderEndDay: string;

  static cloneBase(cloneOrder: Order): Order {
    let order: Order = new Order();
    order.orderId = cloneOrder.orderId;
    order.orderStatus = cloneOrder.orderStatus;
    order.orderPriceInDay = cloneOrder.orderPriceInDay;
    order.orderStartDay = cloneOrder.orderStartDay;
    order.orderEndDay = cloneOrder.orderEndDay;
    return order;
  }
}
