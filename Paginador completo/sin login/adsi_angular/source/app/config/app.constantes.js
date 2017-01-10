(function() {

  'use strict';

  angular.module('app.config', [])


  //.constant('BASEURL', 'http://localhost:8080/empresa/webresources/')

   .constant('BASEURL', 'http://192.168.0.115:8080/empresa/webresources/')


  // .config(configure);
  //
  // configure.$inject = ['$authProvider', 'BASEURL'];
  //
  // function configure($authProvider, BASEURL) {
  //   // Parametros de configuración Satellizer
  //   $authProvider.loginUrl = BASEURL + 'auth/login';
  // }

})();
