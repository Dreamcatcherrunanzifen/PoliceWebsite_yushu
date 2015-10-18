/**
 *
 */
(function(app){
    app.controller('articleDetailCtrl',['$scope','$http','$location',function($scope,$http,$location){
    	function _init(){
    		var _re = new RegExp("^/articleDetail/(\\d*)");
	        var _id = $location.path().match(_re)[1];
	        
    		$http.get("articleDetail?articleId="+_id).success(function(data){
        		$scope.article=eval('('+data+')');
        		console.log($scope.article);
        	});
    	};
    	_init();
	}]);
}(app));