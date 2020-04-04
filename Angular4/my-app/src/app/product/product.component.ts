import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

	products = ['1','2','3'];
	newprod = '';
	addprod = function (){
		if(this.newprod != ''){
			this.products.push(this.newprod);
			this.newprod = '';
		}
	}
	
	deleteprod = function(ind){
		this.products.splice(ind,1);
	}
  constructor() { }

  ngOnInit() {
  }

}
