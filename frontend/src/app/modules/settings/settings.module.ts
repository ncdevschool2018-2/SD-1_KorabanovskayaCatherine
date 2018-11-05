import {NgModule} from "@angular/core";
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
//bootstrap imports
import {AccordionModule} from 'ngx-bootstrap/accordion';
import {ButtonsModule} from 'ngx-bootstrap/buttons';
// components
import {SettingsComponent} from "./components/settings/settings.component";
import {GeneralSettingsComponent} from "./components/general-settings/general-settings.component";
import {BillingAccountSettingsComponent} from "./components/billing-account-settings/billing-account-settings.component";


@NgModule({
  declarations: [
    SettingsComponent,
    GeneralSettingsComponent,
    BillingAccountSettingsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,

    AccordionModule.forRoot(),
    ButtonsModule.forRoot()
  ],
  exports: []
})
export class SettingsModule {

}
