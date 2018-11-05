import {NgModule} from "@angular/core";
import {RouterModule, Routes} from "@angular/router";
// components
import {SubscriptionEditorComponent} from "./modules/subscription-editor/components/subscription-editor/subscription-editor.component";
import {StoreComponent} from "./modules/store/components/store/store.component";
import {AdminTablesComponent} from "./modules/admin-tables/components/admin-tables/admin-tables.component";
import {SettingsComponent} from "./modules/settings/components/settings/settings.component";
import {OrderEditorComponent} from "./modules/order-editor/components/order-editor/order-editor.component";
import {LogInComponent} from "./modules/module/components/log-in/log-in.component";
import {SignInComponent} from "./modules/module/components/sign-in/sign-in.component";

const appRoutes: Routes = [
  {path: 'store', component: StoreComponent},
  {path: 'tables', component: AdminTablesComponent},
  {path: 'subs', component: SubscriptionEditorComponent},
  {path: 'settings', component: SettingsComponent},
  {path: 'orders', component: OrderEditorComponent},
  {path: 'log-in', component: LogInComponent},
  {path: 'sign-in', component: SignInComponent}
];

@NgModule({
  imports: [
    RouterModule.forRoot(appRoutes,
      {enableTracing: true}
    )
  ],
  exports: [
    RouterModule,
  ],
})
export class AppRoutingModule {
}
