import {Component, OnInit} from '@angular/core';
import {Link} from "./modules/module/components/navbar/navbar.component";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'MySub-s';

  public links: Link[] = [];

  ngOnInit() {
    this.links.push(
      {name: 'Store', link: 'store'},
      {name: 'Tables', link: 'tables'},
      {name: 'Subs', link: 'subs'},
      {name: 'Orders', link: 'orders'},
      {name: 'Settings', link: 'settings'}
    );
  }
}
