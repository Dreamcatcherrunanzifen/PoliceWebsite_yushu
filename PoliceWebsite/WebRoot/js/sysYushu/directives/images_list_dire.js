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
					console.log(scope.imgList);
				})
			}
		}
	}])
}(angular))