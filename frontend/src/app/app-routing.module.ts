import {NgModule} from "@angular/core";
import {RouterModule, Routes} from "@angular/router";
import {TableSubscriptionsComponent} from "./modules/module/components/table-subscriptions/table-subscriptions.component";
import {TableUsersComponent} from "./modules/module/components/table-users/table-users.component";

const appRoutes: Routes = [
  { path: 'table-subs', component: TableSubscriptionsComponent},
  { path: 'table-users', component: TableUsersComponent}
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
export class AppRoutingModule {}
