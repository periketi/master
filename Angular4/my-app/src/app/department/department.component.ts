import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-department',
  templateUrl: './department.component.html',
  styleUrls: ['./department.component.css']
})
export class DepartmentComponent implements OnInit {


	dept = ['1','2','3'];
	newdept = '';
	adddept = function (){
		if(this.newdept != ''){
			this.dept.push(this.newdept);
			this.newdept = '';
		}
	}
	
	deletedept = function(ind){
		this.dept.splice(ind,1);
	}
	
  constructor() { }

  ngOnInit() {
  }

}
