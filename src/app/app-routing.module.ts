import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddNewEmployeeComponent } from './employee/add-new-employee/add-new-employee.component';
import { DeleteEmployeeComponent } from './employee/delete-employee/delete-employee.component';
import { UpdateEmployeeComponent } from './employee/update-employee/update-employee.component';

const routes: Routes = [

  {path:'deleteemployee', component:DeleteEmployeeComponent },
  {path:'updateemployee', component:UpdateEmployeeComponent },
  {path:'addnewemployee', component:AddNewEmployeeComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
