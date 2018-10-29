import {Component, OnDestroy, OnInit} from '@angular/core';
import {CompanySubscription} from "../../../../model/company-subscription";
import {BsModalRef, BsModalService} from "ngx-bootstrap";
import {Subscription} from "rxjs";
import {CompanySubscriptionService} from "../../../../services/company-subscription.service";

@Component({
  selector: 'app-table-subscriptions',
  templateUrl: './table-subscriptions.component.html',
  styleUrls: ['./table-subscriptions.component.css']
})
export class TableSubscriptionsComponent implements OnInit, OnDestroy {

  public companySubscriptions: CompanySubscription[] = [];
  public modalRef: BsModalRef;

  private subscriptions: Subscription[] = [];

  constructor(private companySubscriptionService: CompanySubscriptionService,
              private modalService: BsModalService) { }

  ngOnInit() {
    this.loadSubscriptions();
  }

  ngOnDestroy() {
  }

  public _updateSubscription(): void {
    this.loadSubscriptions();
  }

  public _deleteSubscription(subId: string): void {
    this.subscriptions.push(
      this.companySubscriptionService.deleteCompanySubscription(subId).subscribe(() => {
        this._updateSubscription();
      })
    )
  }

  private loadSubscriptions(): void {
    // this.subscriptions.push(
    //   this.companySubscriptionService.getCompanySubscriptions().subscribe(subs => {
    //     this.companySubscriptions = subs as CompanySubscription[];
    //   })
    // )
    this.companySubscriptions.push(
      {
        subId: '2',
        companyId: '2',
        subName: 'Yandex Music',
        subPrice: '0.2',
        subInformation: 'music for you',
        subUrl: 'http'
      },
      {
        subId: '3',
        companyId: '2',
        subName: 'Yandex Maps',
        subPrice: '0.1',
        subInformation: 'gps',
        subUrl: 'http'
      }
    );
  }

}
