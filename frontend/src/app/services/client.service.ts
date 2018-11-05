import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Client} from "../model/client";

@Injectable({
  providedIn: 'root'
})
export class ClientService {

  constructor(private http: HttpClient) {}

  getClients(): Observable<Client[]> {
    return this.http.get<Client[]>('/api/clients');
  }

  saveClient(client: Client): Observable<Client> {
    return this.http.post<Client>('/api/clients', client); // subUrl
  }

  deleteClient(clientId: string): Observable<void> {
    return this.http.delete<void>('/api/clients/' + clientId); // subUrl
  }
}
