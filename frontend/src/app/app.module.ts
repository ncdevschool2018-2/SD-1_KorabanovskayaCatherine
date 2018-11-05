import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
// boot component
import {AppComponent} from './app.component';
//bootstrap imports
import {AlertModule} from 'ngx-bootstrap/alert';
import {BsDatepickerModule} from 'ngx-bootstrap/datepicker';
import {CollapseModule} from 'ngx-bootstrap/collapse';
// modules
import {AppRoutingModule} from "./app-routing.module";
import {SubscriptionEditorModule} from "./modules/subscription-editor/subscription-editor.module";
import {StoreModule} from "./modules/store/store.module";
import {AdminTablesModule} from "./modules/admin-tables/admin-tables.module";
import {SettingsModule} from "./modules/settings/settings.module";
import {OrderEditorModule} from "./modules/order-editor/order-editor.module";
// services
import {CompanySubscriptionService} from "./services/company-subscription.service";
import {UsersService} from "./services/users.service";
import {ClientService} from "./services/client.service";
import {CompanyService} from "./services/company.service";
import {OrderService} from "./services/order.service";
import {RoleService} from "./services/role.service";
// components
import {NavbarComponent} from './modules/module/components/navbar/navbar.component';
import {LogInComponent} from "./modules/module/components/log-in/log-in.component";
import {SignInComponent} from "./modules/module/components/sign-in/sign-in.component";


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    LogInComponent,
    SignInComponent

  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,


    AlertModule.forRoot(),
    BsDatepickerModule.forRoot(),
    CollapseModule.forRoot(),

    AppRoutingModule,
    SubscriptionEditorModule,
    StoreModule,
    AdminTablesModule,
    SettingsModule,
    OrderEditorModule
  ],
  providers: [
    CompanySubscriptionService,
    UsersService,
    ClientService,
    CompanyService,
    RoleService,
    OrderService
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
