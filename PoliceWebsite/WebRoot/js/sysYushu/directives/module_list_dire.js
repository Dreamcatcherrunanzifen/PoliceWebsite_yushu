/**
 * 
 */
(function(angular){
	angular.module('sysYushuApp.moduleList',[])
<<<<<<< HEAD
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
=======
	.directive('moduleList',['$http','$location',function($http,$location){
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
					for(var i=0;i<scope.data.length;i++){
						scope.data[i].addTime=scope.data[i].addDate.toString().split(" ")[0];;
					}
					
				});
				scope.gotoDetail=function($event,itemId){
					$event.preventDefault();
					$location.path('/articleDetail/'+itemId);
				};
			}
		};
	}]);
}(angular));
>>>>>>> branch 'master' of https://github.com/Dreamcatcherrunanzifen/PoliceWebsite_yushu.git
