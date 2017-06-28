var baseAppRoutes = angular.module('baseApp.routes',['ui.router']);

baseAppRoutes.config(['$stateProvider','$urlRouterProvider','$httpProvider',function($stateProvider,$urlRouterProvider,$httpProvider){

	console.log("in routeconfigure");
	$stateProvider
		.state("login",{
		 	url:'/login',
			templateUrl:'http://localhost:7001/demo/src/ContactLogin/views/login.html',
			controller:'http://localhost:7001/demo/src/ContactLogin/controllers/ContactLoginCtrl.js'
		})
	
		
	
	
	
	
		.state("/login:error/:errValue",{
			url:'/home',
			templateUrl:'./resources/js/baseapp/ContactLogin/views/contactLogin.html',
			controller:'contactLoginCtrl'
		})
			$urlRouterProvider.otherwise("/login");
		 
	   }])