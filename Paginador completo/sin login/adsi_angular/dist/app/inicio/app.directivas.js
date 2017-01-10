(function () {
    'use strict';

    angular.module('app.inicio.directivas', []).directive('inicio', inicio);

    function inicio() {
        return {
            scope: {},
            restrict: 'EA',
            templateUrl: 'app/inicio/inicio.html'
        };
    }

})();
