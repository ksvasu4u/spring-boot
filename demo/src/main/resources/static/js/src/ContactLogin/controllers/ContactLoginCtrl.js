angular.module('baseApp')
.controller('ContactLoginCtrl',['$scope','$location', '$localStorage','$q','$rootScope',function($scope,$location,$q, $localStorage,$rootScope){

	$scope.userData ={};
	console.log("$scope.errValuein controller");
	$scope.authenticate =  function(userModel){
		var userName = userModel.username;
		var password = userModel.password;
		//console.log(userName+password);
		var result = AuthenticateService.login(userName,password);
		result.success(onsuccess)
			  .error(onerror);
		
		};
		
		
		onsuccess = function(data){
		 	console.log("1stsuccess");
		 	var usernameResult = AuthenticateService.getCredentials();
		   	usernameResult.success(onusersuccess)
		   	               .error(onusererror);
		 	 //$location.path("/home");
		  
		};
	   onerror = function(data){
		   console.log(" 1 error"+data);
	   }
	   
	  
		
	   onusersuccess = function(data){
		    localStorage.setItem("userData",JSON.stringify(data));
		    localStorage.setItem("Authorities",data.authorities[0].authority);
		    //alert(localStorage.getItem("Authorities"));
		    //console.log(data);
		    //$scope.userData = data;
		    //$localStorage.userData = JSON.stringify($scope.userData);
		   //alert($localStorage.userData);
		    //$window.localStorage.setItem("userData",data);
		    //console.log(JSON.stringify(data));
		    //var data1 = data.authorities[0].authority;
		    //alert(data1);
		    //alert(JSON.stringify(data.authorities[0].authority));
		    //$rootScope.
		    $location.path("/home");
		    //console.log($localStorage.userData);
		    
		};
		
		onusererror = function(data){
		     console.log(data);
		     
		};
}]);