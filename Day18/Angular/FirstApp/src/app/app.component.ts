import { Component } from '@angular/core';
import { User } from './models/user';
import {USERS} from './models/users';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})



export class AppComponent {
  // title = 'It\'s Break Time';
  users=USERS;
  selectedUser:User;
  // user=new User(101,'Syed','ehsan@123',12345);
  onSelect(user:User):void{
    this.selectedUser=user;
  }

  
}
