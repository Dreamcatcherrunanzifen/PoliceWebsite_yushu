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
<<<<<<< HEAD
					console.log(scope.imgList);
				})
			}
		}
	}])
}(angular))
=======
				});
			}
		};
	}]);
}(angular));
>>>>>>> branch 'master' of https://github.com/Dreamcatcherrunanzifen/PoliceWebsite_yushu.git
