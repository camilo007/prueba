(function () {

    'use strict';

    angular.module('app.footer.directivas', [])
    .directive('piepagina', piepagina);

function piepagina() {
    return {
        scope: {},
        restrict: 'EA',
        templateUrl: 'app/footer/footer.html',
      };
    }
})();
