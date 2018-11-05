import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {CompanySubscription} from "../model/company-subscription";

@Injectable({
  providedIn: 'root'
})
export class CompanySubscriptionService {

  constructor(private http: HttpClient) {}

  getCompanySubscriptions(): Observable<CompanySubscription[]> {
    return this.http.get<CompanySubscription[]>('/api/subscriptions'); //  subUrl
  }

  saveCompanySubscription(subscription: CompanySubscription): Observable<CompanySubscription> {
    return this.http.post<CompanySubscription>('/api/subscriptions', subscription); // subUrl
  }

  deleteCompanySubscription(subscriptionId: string): Observable<void> {
    return this.http.delete<void>('/api/subscriptions/' + subscriptionId); // subUrl
  }
}
