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
				})
			}
		}
	}])
}(angular))