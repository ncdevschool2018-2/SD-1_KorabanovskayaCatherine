import {Component, OnDestroy, OnInit} from '@angular/core';
import {CompanySubscription} from "../../../../model/company-subscription";
import {BsModalRef, BsModalService} from "ngx-bootstrap";
import {Subscription} from "rxjs";
import {CompanySubscriptionService} from "../../../../services/company-subscription.service";
import {Company} from "../../../../model/company";

@Component({
  selector: 'app-table-subscriptions',
  templateUrl: './table-subscriptions.component.html',
  styleUrls: ['./table-subscriptions.component.css']
})
export class TableSubscriptionsComponent implements OnInit, OnDestroy {

  public companySubscriptions: CompanySubscription[] = [];
  public modalRef: BsModalRef;

  public currentSubscription: CompanySubscription = new CompanySubscription();
  public currentCompany: Company = new Company();

  private subscriptions: Subscription[] = [];

  constructor(private companySubscriptionService: CompanySubscriptionService,
              private modalService: BsModalService) { }

  ngOnInit() {
    this.loadSubscriptions();
  }

  public _updateSubscription(): void {
    this.loadSubscriptions();
  }

  public _deleteSubscription(subId: string): void {
    this.subscriptions.push(
      this.companySubscriptionService.deleteCompanySubscription(subId).subscribe(() => {
        this._updateSubscription();
      })
    );
    this.refreshSubscription();
  }

  private refreshSubscription() {
    this.currentSubscription = new CompanySubscription();
  }


  private loadSubscriptions(): void {
    this.subscriptions.push(
      this.companySubscriptionService.getCompanySubscriptions().subscribe(subs => {
        this.companySubscriptions = subs as CompanySubscription[];
      })
    )
  }

  ngOnDestroy() {
    this.subscriptions.forEach(
      subscription => subscription.unsubscribe()
    );
  }
}
