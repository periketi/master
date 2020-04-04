import { Injectable } from '@angular/core';
import { Http } from '@angular/http';

@Injectable()
export class EmpService {

  constructor(private _http: Http) { }
  public getEmplyoyeeDetails(){
	  this._http.get('localhost:9999/logindetails');
  }

}
