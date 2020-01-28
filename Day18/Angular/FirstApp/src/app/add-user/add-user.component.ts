import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {

  registerUser: FormGroup;

  constructor(private formBuilder: FormBuilder, private userService: UserService) { }

  addUser() {
    this.userService.saveUser(this.registerUser.value).subscribe(data=>{
      console.log('User Inserted Successfully');
    });
  }

  onSubmit(){
    console.log(this.registerUser.value);
  }

  ngOnInit() {
    this.registerUser=this.formBuilder.group({
      id: ['',Validators.required],
      name: ['',Validators.required],
      email: ['',[Validators.required,Validators.email]],
      phone: ['',Validators.required]
    });
  }

}
