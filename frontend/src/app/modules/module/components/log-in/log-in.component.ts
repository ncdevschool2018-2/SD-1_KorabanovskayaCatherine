import {Component, OnDestroy, OnInit} from '@angular/core';
import {User} from "../../../../model/user";

@Component({
  selector: 'app-log-in',
  templateUrl: './log-in.component.html',
  styleUrls: ['./log-in.component.css']
})
export class LogInComponent implements OnInit, OnDestroy {

  public user: User = new User();
  public rememberMe: boolean = false;

  constructor() { }

  public _logIn() {
    console.log(this.user);
    console.log(this.rememberMe);
  }

  public _signIn() {
    console.log(this.user);
    console.log(this.rememberMe);
  }

  ngOnInit() {
  }

  ngOnDestroy() {

  }

}
