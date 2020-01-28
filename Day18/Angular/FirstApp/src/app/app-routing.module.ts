import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegisterComponent } from './user/register/register.component';
import { SwiggyComponent } from './swiggy/swiggy.component';
import { DisplayUsersComponent } from './display-users/display-users.component';
import { AddUserComponent } from './add-user/add-user.component';


const routes: Routes = [
  {path:'register', component : RegisterComponent },
  {path:'delivery',component: SwiggyComponent},
  {path:'display',component:DisplayUsersComponent},
  {path:'add-user',component:AddUserComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
