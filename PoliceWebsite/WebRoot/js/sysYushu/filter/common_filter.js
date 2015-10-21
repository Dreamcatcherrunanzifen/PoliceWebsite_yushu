/**
 * 
 */
(function(angular){
	angular.module('sysYushuApp.commonFilter',[])
	.filter('date2CnWeek', [function(formatDate){
            return function(input){
                var _dayArr = ['周日','周一','周二','周三','周四','周五', '周六'];

                return _dayArr[input];
<<<<<<< HEAD
            }
        }])
	 
 }(angular))
=======
            };
        }]);
	 
 }(angular));
>>>>>>> branch 'master' of https://github.com/Dreamcatcherrunanzifen/PoliceWebsite_yushu.git
