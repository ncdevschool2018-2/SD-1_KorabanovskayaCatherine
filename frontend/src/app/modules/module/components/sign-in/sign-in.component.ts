import {Component, OnDestroy, OnInit} from '@angular/core';
import {User} from "../../../../model/user";
import {Client} from "../../../../model/client";

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent implements OnInit, OnDestroy {

  public user: User = new User();
  public client: Client = new Client();

  public rememberMe: boolean = false;

  // для работы с паролем
  public password: string = "";
  public confirmPassword: string = "";
  public confirm: boolean = undefined;

  //TODO: изменить настройки максимальной даты
  // добавить минимальную дату
  public calendarMaxDate: Date = new Date(Date.now());

  constructor() { }

  ngOnInit() {
  }

  ngOnDestroy() {
  }

  public _logIn() {
    // console.log(this.password);
    // console.log(this.confirmPassword);
    console.log(this.user);
    console.log(this.client);
    // console.log(this.rememberMe);
    // console.log(this.calendarMaxDate);
  }

  public _signIn() {
    // this.user.registrationDate = new Date(Date.now()).toString();
  }

  public confirmPasswords(): void {
    if (this.password !== '') {
      if (this.password === this.confirmPassword) {
        this.user.userPassword = this.password;
        this.confirm = true;
      } else {
        this.user.userPassword = undefined;
        this.confirm = false;
      }
    } else {
      this.confirm = undefined;
    }
  }

  public dateChange(value: Date): void {
    if (value.toString() === "Invalid Date") {
      this.client.clientDateBirthday = undefined;
    } else {
      this.client.clientDateBirthday = SignInComponent.convertTime(value);
    }
  }

  private static convertTime(date: Date): string {
    let datetime: string = date.toLocaleString();
    let index: number = datetime.indexOf(',');
    return datetime.substring(0, index);
  }
}
