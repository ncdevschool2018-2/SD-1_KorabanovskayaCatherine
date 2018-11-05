import {NgModule} from "@angular/core";
import {BrowserModule} from "@angular/platform-browser";
import {FormsModule} from "@angular/forms";
//bootstrap imports
import {TabsModule} from 'ngx-bootstrap/tabs';
//components
import {OrderEditorComponent} from "./components/order-editor/order-editor.component";
//modules
import {SubscriptionEditorModule} from "../subscription-editor/subscription-editor.module";

@NgModule({
  declarations: [
    OrderEditorComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,

    TabsModule.forRoot(),

    SubscriptionEditorModule
  ],
  exports: [

  ]
})
export class OrderEditorModule {


}
