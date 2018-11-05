import {Component, OnDestroy, OnInit} from '@angular/core';
import {User} from "../../../../model/user";
import {Client} from "../../../../model/client";
import {Company} from "../../../../model/company";
import {Roles} from "../../../../model/enums/roles";
import {Subscription} from "rxjs";
import {UsersService} from "../../../../services/users.service";

@Component({
  selector: 'app-general-settings',
  templateUrl: './general-settings.component.html',
  styleUrls: ['./general-settings.component.css']
})
export class GeneralSettingsComponent implements OnInit, OnDestroy {

  public user: User = new User();
  public company: Company = new Company();
  public client: Client = new Client();
  public currentRole: Roles = Roles.COMPANY;

  private subscriptions: Subscription[] = [];

  constructor(private userService: UsersService) { }

  ngOnInit() {
  }

  private loadUser(): void {
    this.subscriptions.push(
      // TODO
    )
  }

  ngOnDestroy(): void {
    this.subscriptions.forEach(
      subscription => subscription.unsubscribe()
    );
  }

}
