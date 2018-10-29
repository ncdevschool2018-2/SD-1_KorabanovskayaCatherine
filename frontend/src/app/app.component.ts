import { Component } from '@angular/core';
import {Link} from "./modules/module/components/navbar/navbar.component";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'MySub-s';

  public linksForAdmin: Link[] = [
    {
      name:'Users',
      link:'table-users'
    },
    {
      name:'Subs',
      link:'table-subs'
    }
  ];
}
