import {NgModule} from "@angular/core";
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
// components
import {SubscriptionEditorComponent} from './components/subscription-editor/subscription-editor.component';
import {SubscriptionFormComponent} from "./components/subscription-form/subscription-form.component";

@NgModule({
  declarations: [
    SubscriptionEditorComponent,
    SubscriptionFormComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  exports: [
    SubscriptionFormComponent
  ]
})
export class SubscriptionEditorModule {
}
