var repeateApp = angular.module("MYAPP",[]);
var repeateContoller = function ($scope){
	var employees =[
			{name:"Jeevan",Age:"30",desgination:"SSE"},
			{name:"mukund",Age:"31",desgination:"PSE"},
			{name:"pattabhi",Age:"32",desgination:"Manager"},
			{name:"kapil",Age:"33",desgination:"BA"},
	
	];
	$scope.employees=employees;
};

var repeateContollerNew = function ($scope){
	var countries =[
			{ 	name:"USA",
				cities : [
					{name:"Florida" },
					{ name:"Dallas" },
					 { name:"Washington"}
				]
			},
			{	name:"INDIA",
				cities : [
					{name:"HYD" } ,
					{ name:"DELHI" },
						{ name:"CHENNAI"}
				]
			},
			{	name:"UK",
				cities : [
					{name:"LONDON" } ,
					{ name:"OVAL" },
						{ name:"Manchestar"}
				]
			},
	
	];
	$scope.countries=countries;
};
repeateApp.controller("repeateContoller",repeateContoller);
repeateApp.controller("repeateContollerNew",repeateContollerNew);
