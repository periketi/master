import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { ProductComponent } from './product/product.component';
import { DepartmentComponent } from './department/department.component';
import { EmployeeComponent } from './employee/employee.component';


@NgModule({
  declarations: [
    AppComponent,
    ProductComponent,
    DepartmentComponent,
    EmployeeComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    FormsModule,
    RouterModule.forRoot([{
    	'path':'prod',
    	component : ProductComponent
    },
    {
    	'path':'dept',
    	component : DepartmentComponent
    }
    
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
