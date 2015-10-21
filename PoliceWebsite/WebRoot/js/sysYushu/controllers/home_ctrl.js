/**
 * 
 */
(function(angular){
	angular.module('sysYushuApp.homeModule',[])
	.controller('homeCtrl',['$scope','$window','$http',function($scope,$window,$http){
		$scope.curTime=new Date();
		$scope.week=$scope.curTime.getDay();
		$scope.slides=[
		              {imgurl:'/PoliceWebsite/images/web/test_pic1.jpg'},
		              {imgurl:'/PoliceWebsite/images/web/test_pic2.jpg'},
		              {imgurl:'/PoliceWebsite/images/web/test_pic3.jpg'}];
	}]);
}(angular));