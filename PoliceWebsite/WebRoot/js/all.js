/**
 * 
 */
(function(angular,jq){
	var root = "/PoliceWebsite/templates/";
	var app=angular.module('sysYushuApp',
			['ngRoute',
			 'sysYushuApp.moduleList',
			 'sysYushuApp.commonFilter',
			 'angular-carousel',
			 'sysYushuApp.homeModule',
			 'sysYushuApp.aboutYushuModule',
			 'sysYushuApp.infoPublicModule',
			 'sysYushuApp.instituSettingModule',
			 'sysYushuApp.liveMessageCtrlModule',
			 'sysYushuApp.manageModule',
			 'sysYushuApp.policeDyModule',
			 'sysYushuApp.satisfactionModule',
			 'sysYushuApp.imagesList',
			 'sysYushuApp.sinaWechat'])
	.config(['$routeProvider', '$httpProvider', function($routeProvider,$httpProvider){
		$routeProvider
		.when("/home", {templateUrl: root + "home_tpl.html", controller: "homeCtrl"})
		.when("/instituSetting", {templateUrl: root + "instituSetting_tpl.html", controller: "instituSettingCtrl"})
		.when("/policeDy", {templateUrl: root + "policeDy_tpl.html", controller: "policeDyCtrl"})
		.when("/infoPublic", {templateUrl: root + "infoPublic_tpl.html", controller: "infoPublicCtrl"})
		.when("/aboutYushu", {templateUrl: root + "aboutYushu_tpl.html", controller: "aboutYushuCtrl"})
		.when("/satisfaction", {templateUrl: root + "satisfaction_tpl.html", controller: "satisfactionCtrl"})
		.when("/liveMessage", {templateUrl: root + "liveMessage_tpl.html", controller: "liveMessageCtrl"})
		.when("/manage", {templateUrl: root + "manage_tpl.html", controller: "manageCtrl"})
		.otherwise( {redirectTo:'/home'});
	}])
	.controller('appCtrl',["$scope",'$location',function($scope,$location){
		console.log("ok");
		$scope.menuSelected='home';
		$scope.changePath=function(str){
			$scope.menuSelected=str;
			$location.path(str);
		};
	}]);
	

}(angular,jQuery));

}(angular,jQuery));
/**
 * 
 */
(function(angular){
	angular.module('sysYushuApp.aboutYushuModule',[])
	.controller('aboutYushuCtrl',['$scope','$window','$http',function($scope,$window,$http){

	}]);
}(angular));
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
/**
 * 
 */
(function(angular){
	angular.module('sysYushuApp.infoPublicModule',[])
	.controller('infoPublicCtrl',['$scope','$window','$http',function($scope,$window,$http){

	}]);
}(angular));
/**
 * 
 */
(function(angular){
	angular.module('sysYushuApp.instituSettingModule',[])
	.controller('instituSettingCtrl',['$scope','$window','$http',function($scope,$window,$http){

	}]);
}(angular));
/**
 * 
 */
(function(angular){
	angular.module('sysYushuApp.liveMessageCtrlModule',[])
	.controller('liveMessageCtrl',['$scope','$window','$http',function($scope,$window,$http){

	}]);
}(angular));
/**
 * 
 */
(function(angular){
	angular.module('sysYushuApp.manageModule',[])
	.controller('manageCtrl',['$scope','$window','$http',function($scope,$window,$http){

	}]);
}(angular));
/**
 * 
 */
(function(angular){
	angular.module('sysYushuApp.policeDyModule',[])
	.controller('policeDyCtrl',['$scope','$window','$http',function($scope,$window,$http){

	}]);
}(angular));
/**
 * 
 */
(function(angular){
	angular.module('sysYushuApp.satisfactionModule',[])
	.controller('satisfactionCtrl',['$scope','$window','$http',function($scope,$window,$http){

	}]);
}(angular));
/**
 * 
 */
(function(angular){
	angular.module('sysYushuApp.imagesList',[])
	.directive('imagesList',['$http',function($http){
		return {
			restrict:"E",
			replace:true,
			scope:{},
			templateUrl:"/PoliceWebsite/templates/imagesList.html",
			link:function(scope,elem,attr){
				$http.get('imglist').success(function(data){
					scope.imgList=eval('('+data+')');
				});
			}
		};
	}]);
}(angular));
/**
 * 
 */
(function(angular){
	angular.module('sysYushuApp.moduleList',[])
	.directive('moduleList',['$http',function($http){
		return {
			restrict:"E",
			replace:true,
			scope:{
				tplType:'@',
				articleType:'='
			},
			templateUrl:"/PoliceWebsite/templates/moduleList.html",
			link:function(scope,elem,attr){
				$http.get('articlelist?articletype='+scope.articleType).success(function(data){
					scope.data=eval('('+data+')');
					console.log(scope.data.date);
				});
			}
		};
	}]);
}(angular));
/**
 * 
 */
(function(angular){
	angular.module('sysYushuApp.sinaWechat',[])
	.directive('sinaWechat',['$http',function($http){
		return {
			restrict:"E",
			replace:true,
			scope:{},
			templateUrl:"/PoliceWebsite/templates/sina_wechat_tpl.html",
			link:function(scope,elem,attr){
			}
		};
	}]);
}(angular));
/**
 * 
 */
(function(angular){
	angular.module('sysYushuApp.commonFilter',[])
	.filter('date2CnWeek', [function(formatDate){
            return function(input){
                var _dayArr = ['周日','周一','周二','周三','周四','周五', '周六'];

                return _dayArr[input];
            };
        }]);
	 
 }(angular));

