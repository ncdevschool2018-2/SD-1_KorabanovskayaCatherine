export class CompanySubscription {

  subId: string;
  companyId: string;
  subName: string;
  subUrl:string;
  subPrice: string;
  subInformation: string;

  //
  // указаны не все поля

  static cloneBase(subscription: CompanySubscription) : CompanySubscription {
    let clonedSubscription = new CompanySubscription();
    clonedSubscription.subId = subscription.subId;
    clonedSubscription.companyId = subscription.companyId;
    clonedSubscription.subName = subscription.subName;
    clonedSubscription.subPrice = subscription.subPrice;
    clonedSubscription.subInformation = subscription.subInformation;
    clonedSubscription.subUrl = subscription.subUrl;
    return clonedSubscription;
  }
}
