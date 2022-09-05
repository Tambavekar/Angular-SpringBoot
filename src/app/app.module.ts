import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddNewEmployeeComponent } from './employee/add-new-employee/add-new-employee.component';
import { UpdateEmployeeComponent } from './employee/update-employee/update-employee.component';
import { DeleteEmployeeComponent } from './employee/delete-employee/delete-employee.component';
import { FormsModule } from '@angular/forms';
import {HttpClientModel}

@NgModule({
  declarations: [
    AppComponent,
    AddNewEmployeeComponent,
    UpdateEmployeeComponent,
    DeleteEmployeeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModel
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
