import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  @Input()
  public links: Link[] = [];
  public isCollapsed: boolean = true;

  constructor() { }

  ngOnInit() {
  }

}

export class Link {
  link: string;
  name: string;
}
