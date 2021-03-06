import { Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {User} from "../model/user";


@Injectable({
  providedIn: 'root'
})
export class UsersService {

  constructor(private http: HttpClient) {}

  getUsers(): Observable<User[]> {
    return this.http.get<User[]>('users.json');
  }

  deleteUser(userId: string): Observable<void> {
    return this.http.delete<void>('api/users/' + userId); // subUrl
  }

  saveUser(user: User): Observable<User> {
    return this.http.post<User>('api/users', user);
  }
}
