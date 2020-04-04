var myapp =angular.module("mymodule",[]);
var mycontroller = function($scope){
	$scope.message="Hello Angular!";
};

myapp.controller("mycontroller",mycontroller);