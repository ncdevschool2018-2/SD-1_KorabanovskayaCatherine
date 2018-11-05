import {NgModule} from "@angular/core";
import {BrowserModule} from "@angular/platform-browser";
import {FormsModule} from "@angular/forms";
// bootstrap imports
import {CarouselModule} from 'ngx-bootstrap/carousel';
import {BsDropdownModule} from 'ngx-bootstrap/dropdown';
// components
import {StoreComponent} from "./components/store/store.component";
import {FooterComponent} from "./components/footer/footer.component";
// modules
import {SubscriptionEditorModule} from "../subscription-editor/subscription-editor.module";

@NgModule({
  declarations: [
    StoreComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,

    CarouselModule.forRoot(),
    BsDropdownModule.forRoot(),

    SubscriptionEditorModule
  ],
  exports: []
})
export class StoreModule {
}
