import { Component, OnInit } from '@angular/core';
import { EmpService } from './services/emp.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css'],
  providers:[EmpService]
})
export class EmployeeComponent implements OnInit {

  constructor(private empService: EmpService) { }

  ngOnInit() {
  }
  
  getEmpData(){
	  this.empService.getEmplyoyeeDetails.subscribe(res => this.empName  = res.json[0])
  }

}
