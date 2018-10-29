import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { LandingComponent } from './modules/module/components/landing/landing.component';
import { LogInComponent } from './modules/module/components/log-in/log-in.component';

import { ModalModule } from 'ngx-bootstrap/modal';
import { AlertModule } from 'ngx-bootstrap/alert';
import { BsDatepickerModule } from 'ngx-bootstrap/datepicker';
import { ButtonsModule } from 'ngx-bootstrap/buttons'

import { FormsModule }   from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { SignInComponent } from './modules/module/components/sign-in/sign-in.component';
import { TableUsersComponent } from './modules/module/components/table-users/table-users.component';
import { TableClientsComponent } from './modules/module/components/table-clients/table-clients.component';
import { TableSubscriptionsComponent } from './modules/module/components/table-subscriptions/table-subscriptions.component';
import { NavbarComponent } from './modules/module/components/navbar/navbar.component';
import { AppRoutingModule } from "./app-routing.module";
import {CompanySubscriptionService} from "./services/company-subscription.service";
import {UsersService} from "./services/users.service";
import { LandingAdminComponent } from './modules/module/components/landing-admin/landing-admin.component';

@NgModule({
  declarations: [
    AppComponent,
    LandingComponent,
    LogInComponent,
    SignInComponent,
    TableUsersComponent,
    TableClientsComponent,
    TableSubscriptionsComponent,
    NavbarComponent,
    LandingAdminComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    ModalModule.forRoot(),
    AlertModule.forRoot(),
    BsDatepickerModule.forRoot(),
    ButtonsModule.forRoot(),
    AppRoutingModule
  ],
  providers: [
    CompanySubscriptionService,
    UsersService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
