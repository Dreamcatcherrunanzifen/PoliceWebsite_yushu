/**
 * 
 */
<<<<<<< HEAD
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
=======
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
		.when("/articleDetail/?:articleId", {templateUrl: root + "articleDetail_tpl.html", controller: "articleDetailCtrl"})
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
	
>>>>>>> branch 'master' of https://github.com/Dreamcatcherrunanzifen/PoliceWebsite_yushu.git
