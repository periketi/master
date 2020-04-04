var myApp = angular.module("myApp",[]);
var myController = function($scope){
	
	
	var techs = [
		{name:"Jeevan",Age:"30",desgination:"SSE"},
		{name:"mukund",Age:"31",desgination:"PSE"},
		{name:"pattabhi",Age:"32",desgination:"Manager"},
		{name:"kapil",Age:"33",	desgination:"BA"}] ;
	
	$scope.techs= techs;
	$scope.sortcolumn= "name";
};
myApp.controller("myController",myController);