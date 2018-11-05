import {Component, OnDestroy, OnInit, TemplateRef} from '@angular/core';
import {Subscription} from "rxjs";
import {BsModalRef, BsModalService} from "ngx-bootstrap";

import {User} from "../../../../model/user";
import {UsersService} from "../../../../services/users.service";
import {Client} from "../../../../model/client";
import {Company} from "../../../../model/company";
import {Roles} from "../../../../model/enums/roles";
import {RoleService} from "../../../../services/role.service";
import {CompanyService} from "../../../../services/company.service";

@Component({
  selector: 'app-table-users',
  templateUrl: './table-users.component.html',
  styleUrls: ['./table-users.component.css']
})
export class TableUsersComponent implements OnInit, OnDestroy {

  public users: User[] = [];

  public currentUser: User = new User();
  public currentClient: Client = new Client();
  public currentCompany: Company = new Company();
  public maxAvailableSub: number;

  // константные
  public ROLES: string[] = [
    Roles.CLIENT,
    Roles.COMPANY
  ];
  public chooseRole: string = this.ROLES[0];
  public currentRole: Roles = Roles.COMPANY;


  public modalRef: BsModalRef;

  private subscriptions: Subscription[] = [];

  constructor(private userService: UsersService,
              private modalService: BsModalService,
              private roleService: RoleService,
              private companyService: CompanyService) {
  }

  ngOnInit() {
    this.loadUsers();
  }

  public _updateUsers(): void {
    this.loadUsers();
  }

  public _deleteUser(userId: string): void {
    this.subscriptions.push(
      this.userService.deleteUser(userId).subscribe(() => {
        this._updateUsers();
      })
    );
    this.refreshUser();
  }

  public _saveUser(): void {
    //TODO: save user
    this._closeModal();
    this._updateUsers();
  }

  public _chooseUser(user: User) {
    this.currentUser = user;
    this.currentRole = null; // TODO: получить роль от текущего пользователя
    this.currentCompany = null; // получить компанию или клиента
    this.currentClient = null;

    if (this.currentRole === Roles.COMPANY) {
      this.maxAvailableSub = +this.currentCompany.maxAmountAvailableSubs;
    }
  }

  public _changeMaxAvailableSub() {
    let company: Company = Company.cloneBase(this.currentCompany);
    company.maxAmountAvailableSubs = this.maxAvailableSub.toString();
    this.companyService.saveCompany(company);
    this._updateUsers();
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
      this.userService.getUsers().subscribe(users => {
        this.users = users as User[];
      })
    );
  }

  private refreshClient(): void {
    this.currentClient = new Client();
  }

  private refreshCompany(): void {
    this.currentCompany = new Company();
  }

  private refreshUser(): void {
    this.currentUser = new User();
  }

  ngOnDestroy() {
    this.subscriptions.forEach(
      subscription => subscription.unsubscribe()
    );
  }

}
