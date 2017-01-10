(function () {

    'use strict';

        angular.module('app.header.directivas', [])
        .directive('encabezado', encabezado);

function encabezado() {
    return {
        scope: {},
        restrict: 'EA',
        templateUrl: 'app/header/header.html'
      };
   }
})();
