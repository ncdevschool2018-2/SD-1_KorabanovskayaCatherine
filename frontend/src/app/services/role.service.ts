import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Role} from "../model/role";


@Injectable({
  providedIn: 'root'
})
export class RoleService {

  constructor(private http: HttpClient) {}

  getRoles(): Observable<Role> {
    return this.http.get<Role>('/api/roles');
  }

  getRoleNameById(roleId: string): Observable<string> {
    return this.http.get<string>('/api/roles/name/' + roleId);
  }

  getRoleNames(): Observable<string[]> {
    return this.http.get<string[]>('/api/roles/names');
  }
}
