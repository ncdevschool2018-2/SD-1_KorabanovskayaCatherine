import {Component, OnDestroy, OnInit, TemplateRef} from '@angular/core';
import {Subscription} from "rxjs";
import {BsModalRef, BsModalService} from "ngx-bootstrap";

import {CompanySubscription} from "../../../../model/company-subscription";
import {CompanySubscriptionService} from "../../../../services/company-subscription.service";

@Component({
  selector: 'app-store',
  templateUrl: './store.component.html',
  styleUrls: ['./store.component.css']
})
export class StoreComponent implements OnInit, OnDestroy {

  public slides: Slide[] = [];

  public categories: string[] = [];
  public currentCategory: string = '';

  public companySubscriptions: CompanySubscription[] = [];
  public currentSubscription: CompanySubscription = new CompanySubscription();
  public modalRef: BsModalRef;

  private subscriptions: Subscription[] = [];

  constructor(private modalService: BsModalService,
              private companySubscriptionService: CompanySubscriptionService) {
  }

  ngOnInit(): void {
    this.loadSlides();
    this.loadCategories();
    this.currentCategory = this.categories[0] ? this.categories[0] : '';

    this.loadSubscription();
  }

  public _setCurrentCategory(category: string): void {
    this.currentCategory = category;
  }

  public _openModal(template: TemplateRef<any>, companySubscription?: CompanySubscription): void {
    this.modalRef = this.modalService.show(template);
    this.currentSubscription = companySubscription;
  }

  public _closeModal(): void {
    this.modalRef.hide();
  }

  private loadSlides(): void {
    this.slides.push(
      {
        image: '',
        caption: 'Yandex Music',
        information: 'Cтриминговый сервис компании «Яндекс»'
      },
      {
        image: '',
        caption: 'Spotify',
        information: 'Great Music'
      }
    )
  }

  private loadCategories(): void {
    this.categories.push(
      'all',
      'music',
      'for devs'
    );
  }

  private loadSubscription(): void {
    this.subscriptions.push(
      this.companySubscriptionService.getCompanySubscriptions().subscribe(subs => {
        this.companySubscriptions = subs as CompanySubscription[];
      })
    )
  }

  ngOnDestroy(): void {
    this.subscriptions.forEach(
      subscription => subscription.unsubscribe()
    );
  }

}

//TODO: переделать в сущность и добавить таблицу в бэке
export class Slide {
  image: string;
  caption: string;
  information: string;
}
