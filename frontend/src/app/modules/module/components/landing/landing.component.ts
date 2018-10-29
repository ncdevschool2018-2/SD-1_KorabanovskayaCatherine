import { Component, OnDestroy, OnInit, TemplateRef } from '@angular/core';
import { CompanySubscription } from "../../../../model/company-subscription";

import { BsModalRef, BsModalService } from "ngx-bootstrap";
import { Subscription } from "rxjs/internal/Subscription";
import { CompanySubscriptionService } from "../../../../services/company-subscription.service";

@Component({
  selector: 'app-landing',
  templateUrl: './landing.component.html',
  styleUrls: ['./landing.component.css']
})
export class LandingComponent implements OnInit, OnDestroy {

  public companySubscriptions: CompanySubscription[] = [];
  public modalRef: BsModalRef;
  public editMode: boolean = false;
  public editableSub: CompanySubscription = new CompanySubscription();

  private subscriptions: Subscription[] = [];

  constructor(private subscriptionService: CompanySubscriptionService,
              private modalService: BsModalService) { }

  ngOnInit() {
    this.loadSubscriptions();
  }

  public _closeModal(): void {
    this.modalRef.hide();
  }

  public _openModal(template: TemplateRef<any>, companySubscription?: CompanySubscription): void {
    if(companySubscription) {
        // press button for editing subs
       this.editMode = true;
       this.editableSub = CompanySubscription.cloneBase(companySubscription);
    }
    else {
      // press button for creating sub
      this.editMode = false;
      this.refreshSub();
    }

    // and when the user clicks on the button to open the popup
    // we keep the modal reference and pass the template local subName to the modalService.
    this.modalRef = this.modalService.show(template);
  }

  public _addCompanySubscription(): void {
    this.editableSub.companyId = '2';
    this.subscriptions.push(
      this.subscriptionService.saveCompanySubscription(this.editableSub).subscribe(() => {
        this._closeModal();
        this._updateCompanySubscriptions();
        this.refreshSub();
      })
    );
  }

  public _updateCompanySubscriptions(): void {
    this.loadSubscriptions();
  }

  public _deleteCompanySubscription(companySubscriptionId: string): void {
    this.subscriptions.push(
      this.subscriptionService.deleteCompanySubscription(companySubscriptionId).subscribe(() => {
        this._closeModal();
        this._updateCompanySubscriptions();
      })
    );
  }

  private loadSubscriptions(): void {
    // Get data from BillingAccountService
    this.subscriptions.push(
      this.subscriptionService.getCompanySubscriptions().subscribe(subs => {
        // Parse json response into local array
        this.companySubscriptions = subs as CompanySubscription[];
      })
    );
  }

  private refreshSub(): void {
    this.editableSub = new CompanySubscription();
  }

  ngOnDestroy(): void {
    this.subscriptions.forEach(
      subscription => subscription.unsubscribe()
    );
  }
}
