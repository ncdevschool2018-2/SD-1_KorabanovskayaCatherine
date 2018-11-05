import {Component, OnDestroy, OnInit, TemplateRef} from '@angular/core';
import {BillingAccount} from "../../../../model/billing-account";
import {BsModalRef, BsModalService} from "ngx-bootstrap";

@Component({
  selector: 'app-billing-account-settings',
  templateUrl: './billing-account-settings.component.html',
  styleUrls: ['./billing-account-settings.component.css']
})
export class BillingAccountSettingsComponent implements OnInit, OnDestroy {

  public billingAccount: BillingAccount = new BillingAccount();

  public topUpSum: number = 0;
  public account: string = '';

  public modalRef: BsModalRef;

  constructor(private modalService: BsModalService) { }

  ngOnInit() {
    this.loadBillingAccount();
  }

  public _openModal(template: TemplateRef<any>): void {
    this.modalRef = this.modalService.show(template);
  }

  public _closeModal() {
    this.modalRef.hide();
  }

  public _topUp(): void {
    // пополнение баланса
    this._closeModal();
  }

  public _getAccount(): void {
    this.account = this.billingAccount.baAccount;
  }

  private loadBillingAccount(): void {

  }

  ngOnDestroy(): void {
  }


}
