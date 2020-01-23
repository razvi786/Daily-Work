import { Component, OnInit,Input } from '@angular/core';
import { User } from '../models/user';

@Component({
  selector: 'app-practise',
  templateUrl: './practise.component.html',
  styleUrls: ['./practise.component.css']
})
export class PractiseComponent implements OnInit {

  @Input() user:User;

  buttonClicked():void{
    alert(this.user.name+' You are Awesome!');
  }

  makeYellow():void{
    var button=document.querySelector('#make-me-yellow');
    var old_attribute=button.getAttribute('class');
    button.setAttribute('class',old_attribute+' text-warning');
  }

  hideMe():void{
    var button=document.querySelector('#hide-me');
    button.setAttribute('class','invisible');
  }

  constructor() { }

  ngOnInit() {
  }

}
