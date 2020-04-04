var complexApp = angular.module("myapp",[]);
var mycontroller = function($scope){
	var employee = {
			name:"ravi",
			age:"33",
			desigantion:"SSE"
	}
	$scope.employee =employee;
};
complexApp.controller("mycontroller",mycontroller);