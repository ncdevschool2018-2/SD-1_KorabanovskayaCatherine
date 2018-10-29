import {Component, OnDestroy, OnInit, TemplateRef} from '@angular/core';
import {User} from "../../../../model/user";
import {Role} from "../../../../model/role";
import {UsersService} from "../../../../services/users.service";
import {BsModalRef, BsModalService} from "ngx-bootstrap";
import {Client} from "../../../../model/client";
import {Company} from "../../../../model/company";
import {Subscription} from "rxjs";

@Component({
  selector: 'app-table-users',
  templateUrl: './table-users.component.html',
  styleUrls: ['./table-users.component.css']
})
export class TableUsersComponent implements OnInit, OnDestroy {

  public users: User[] = [];

  private subscriptions: Subscription[] = [];

  public modalRef: BsModalRef;
  public createdUser: User = new User();
  public createdClient: Client = new Client();
  public createdCompany: Company = new Company();

  //TODO: возможность выделения сразу нескольких пользователей
  // public editableUsers: User[] = [];
  //TODO: роли получаем из бд
  public roles: string[] = ['Company', 'Client'];
  public chooseRole: string = this.roles[0] ? this.roles[0] : undefined;

  constructor(private service: UsersService,
              private modalService: BsModalService) { }

  ngOnInit() {
    this.loadUsers();
  }

  ngOnDestroy() {
    this.subscriptions.forEach(
      subscription => subscription.unsubscribe()
    );
  }

  public c(): void {
    console.log(this.users);
    console.log(this.roles);
    console.log(this.chooseRole);
    console.log(this.createdUser);
    console.log(this.createdClient);
    console.log(this.createdCompany);
  }

  public _updateUsers(): void {
    this.loadUsers();
  }

  public _deleteUser(userId: string): void {
    this.subscriptions.push(
      this.service.deleteUser(userId).subscribe(() => {
        this._updateUsers();
      })
    );
  }

  public _saveUser(): void {
    this.subscriptions.push(
      this.service.saveUser(this.createdUser).subscribe(() => {
        this._updateUsers();
        this.refreshUser();
      })
    );
    switch (this.chooseRole.toLocaleLowerCase()) {
      case 'client': {
        // TODO: вызов сервиса клиента
        break;
      }
      case 'company': {
        // TODO: вызов сервиса клмпании
        break;
      }
    }
  }

  public _openModal(template: TemplateRef<any>): void {
    this.refreshUser();
    this.modalRef = this.modalService.show(template);
  }

  public _closeModal(): void {
    this.modalRef.hide();
  }

  private loadUsers(): void {
    this.subscriptions.push(
      this.service.getUsers().subscribe(users => {
        this.users = users as User[];
      })
    );
  }

  private refreshUser() {
    this.createdUser = new User();
    this.createdCompany = new Company();
    this.createdClient = new Client();
    this.chooseRole = this.roles[0] ? this.roles[0] : undefined;
  }

}
