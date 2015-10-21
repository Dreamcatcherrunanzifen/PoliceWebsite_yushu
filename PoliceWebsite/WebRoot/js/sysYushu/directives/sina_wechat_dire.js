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
		}
	}])
}(angular))