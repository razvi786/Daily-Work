import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {

  name:string;
  message:string;
  price:number;
  salary:number;
  dob:Date;
  user={
    id: 1001,
    name: 'syed',
    company: 'cts',
    salary: 22_000
  }
  constructor() { }

  ngOnInit() {
    this.message="Hello Good Morning Everyone";
    this.price=50_000;
    this.salary=45_000.554;
    // this.dob=new Date(); //current date
    this.dob=new Date(1997,6,27);
    this.name='syed Ehsan ali Razvi'
  }

}
