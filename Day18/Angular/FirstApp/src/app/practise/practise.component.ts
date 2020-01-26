import { Component, OnInit,Input, Output, EventEmitter } from '@angular/core';
import { User } from '../models/user';

@Component({
  selector: 'app-practise',
  templateUrl: './practise.component.html',
  // template: `<button class='colorClass' [ngClass]='applyClasses()'>Feeling Boored</button>`,
  // template: `<h2>{{title}}</h2>      
	// <p *ngIf="showElement">Show Element</p>      
	// <div [ngSwitch]="inpvalue">      
	// <p style='color:blue'  *ngSwitchCase="1">You have selected M S Dhoni</p>      
	// <p style='color:blue'  *ngSwitchCase="2">You have selected Sachin Tendulkar</p>      
	// <p style='color:blue'  *ngSwitchCase="3">You have selected David Warner</p>     
	// <p style='color:red'  *ngSwitchDefault>Sorry! Invalid selection....</p>      
	// </div>`,
  styleUrls: ['./practise.component.css']
//   styles: [`.boldClass{    
//     font-weight:bold;    
//       font-size : 30px;    
// }    

// .italicsClass{    
//     font-style:italic;    
// }    

// .colorClass{    
//     color:Red;               
// }`]    
})
export class PractiseComponent implements OnInit {

  isBold: boolean = true;    
		fontSize: number = 30;    
		isItalic: boolean = true;    
    
    MyStyle() {    
        let mystyles = {    
            'font-weight': this.isBold ? 'bold' : 'normal',    
            'font-style': this.isItalic ? 'italic' : 'normal',    
            'font-size.px': this.fontSize    
        };    
    
        return mystyles;    
    }    
    
    applyBoldClass: boolean = true;    
    applyItalicsClass: boolean = true;    
    
    applyClasses() {    
        let classes = {    
            boldClass: this.applyBoldClass,    
            italicsClass: this.applyItalicsClass    
        };    
    
        return classes;    
    }    

    inpvalue: number = 1;

  @Input() user:User;
  @Input() cars:any;
  message="You Understood the Concept :-)";
  complaint="Your Child is Behaving Badly";
  @Output() childMessage=new EventEmitter<string>();
  


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
    this.childMessage.emit(this.message);
    this.childMessage.emit(this.complaint);
  }

  


}
