import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegisterComponent } from './user/register/register.component';
import { SwiggyComponent } from './swiggy/swiggy.component';


const routes: Routes = [
  {path:'register', component : RegisterComponent },
  {path:'delivery',component: SwiggyComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
