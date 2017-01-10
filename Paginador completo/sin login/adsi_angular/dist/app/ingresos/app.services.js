(function() {
  'use strict';
  angular.module('app.ingresos.services', [])
    .factory('Ingresos', Ingresos)
    .factory('Ciudades', Ciudades)
    



  Ingresos.$inject = ['$resource', 'BASEURL'];

  function Ingresos($resource, BASEURL) {
    return $resource(BASEURL + 'ingresos/:idIngreso', {
      idIngreso: '@idIngreso'
    }, {
      update: {
        method: 'PUT'
      },

      queryIngreso:{
        url:BASEURL + 'ingresos/byingre',
        method: 'GET',
        isArray: true
      },

      inhabilit: {
        url: BASEURL + 'ingresos/inhabilit/:idIngreso',
        method: 'PUT',
        params: {
          idIngreso: '@idIngreso'
        }
      },
    });
  }


  Ciudades.$inject = ['$resource', 'BASEURL'];
  //Este servicio nos provee de los métodos GET POST PUT DELETE
  function Ciudades($resource, BASEURL) {
    return $resource(BASEURL + 'ciudades/:idCiudad', {
      idCiudad: '@idCiudad'
    });
  }






})();
