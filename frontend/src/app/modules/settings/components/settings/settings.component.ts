import {Component, OnDestroy, OnInit} from '@angular/core';

@Component({
  selector: 'app-settings',
  templateUrl: './settings.component.html',
  styleUrls: ['./settings.component.css']
})
export class SettingsComponent implements OnInit, OnDestroy {

  public settings: string[] = [
    'General',
    'Billing account'
  ];
  public settingsRadioButton: string = this.settings[0];

  constructor() { }

  ngOnInit() {
  }

  ngOnDestroy(): void {
  }

}
