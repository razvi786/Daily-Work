import { Component } from '@angular/core';
import { User } from './models/user';
import {USERS} from './models/users';
import {Car} from './models/car';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})



export class AppComponent {
  // title = 'It\'s Break Time';
  users=USERS;
  selectedUser:User;
  messageFromChild:string;
  complaintFromTeacher:string;
  // user=new User(101,'Syed','ehsan@123',12345);
  onSelect(user:User):void{
    this.selectedUser=user;
  }

  cars:Car[]=[
    {name:'BMW',price:2_00000,speed:200},
    {name:'Ferrari',price:10_00000,speed:250},
    {name:'Lamborghini',price:20_00000,speed:300},
    {name:'Nano',price:5_00000,speed:150}
  ];

  setMessage(message:string){
    this.messageFromChild=message;
  }

  setComplaint(message:string){
    this.complaintFromTeacher=message;
  }
  
  
}
