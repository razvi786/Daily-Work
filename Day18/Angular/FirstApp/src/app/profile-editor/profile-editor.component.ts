import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-profile-editor',
  templateUrl: './profile-editor.component.html',
  styleUrls: ['./profile-editor.component.css']
})
export class ProfileEditorComponent implements OnInit {

  formProfile=new FormGroup({
    nickName:new FormControl(''),
    realName: new FormControl('')
  });

  onSubmit(){
    console.warn(this.formProfile.value);
  }

  constructor() { }

  ngOnInit() {
  }

}
