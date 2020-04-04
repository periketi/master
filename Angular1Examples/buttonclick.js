var buttonApp = angular.module("MYAPP",[]);
var buttonContoller = function ($scope){
	var tech =[
			{name:"Java",likes:0,dislikes:0},
			{name:"SQL",likes:0,dislikes:2321323230},
			{name:"Angular",likes:0,dislikes:0},
			{name:"Web services",likes:0,dislikes:0},
	
	];
	$scope.tech=tech;
	$scope.rowLimit=3;
	$scope.incLikes = function(technolgy){
		technolgy.likes++;
	}
	$scope.incDislikes = function(technolgy){
		technolgy.dislikes++;
	}
};
buttonApp.controller("buttonContoller",buttonContoller);
