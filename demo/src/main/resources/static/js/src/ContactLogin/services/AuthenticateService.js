angular.module('app.services')
.service('AuthenticateService',['$http','$location',function($http,$location){
	
	
	return{			
    
	    	login : function(uname, pword){
	    		var data = "username="+uname+"&password="+pword;
	    		return $http.post("authenticate",data,{
	    			
	    			 transformRequest: angular.identity,
	    		     transformResponse: angular.identity,
	    		
	    			headers: {
	                    "Content-Type": "application/x-www-form-urlencoded"
	                 }
	    		});
	
	    	 },
	    	 
	    	 getCredentials : function() {
	    		 return $http.get('http://localhost:8083/simpro3/helloRest/getUsername');
	    		
	    	 }
	
			 
    	
		}
	
}]);



/*.then(function (response) {
console.log(response.status);

//$location.path('/home');

},function(error){
console.log(error.status);
});*/