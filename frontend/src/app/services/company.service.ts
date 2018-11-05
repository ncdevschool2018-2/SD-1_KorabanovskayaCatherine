import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Company} from "../model/company";


@Injectable({
  providedIn: 'root'
})
export class CompanyService {

  constructor(private http: HttpClient) {}

  getCompanies(): Observable<Company[]> {
    return this.http.get<Company[]>('/api/companies');
  }

  saveCompany(company: Company): Observable<Company> {
    return this.http.post<Company>('/api/companies', company);
  }

  deleteCompany(companyId: string): Observable<void> {
    return this.http.delete<void>('/api/companies/' + companyId);
  }

}
