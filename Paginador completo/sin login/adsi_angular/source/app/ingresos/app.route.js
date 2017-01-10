(function() {
  'use strict';

  angular.module('app.ingresos.router', []).config(configure);

  //-------------------SE INYECTA LOS PARAMETROS------------------------------//
  configure.$inject = ['$stateProvider', '$urlRouterProvider'];

  //----------------SE CONFIGURA LAS RUTAS DE LA APLICACIÓN PARA EL MODELO-------------------//
  function configure($stateProvider, $urlRouterProvider) {

    $urlRouterProvider.otherwise('/');

    $stateProvider


    .state('ordenCtrl', {
      url: '/ordenCtrl',
      views: {
        'ordenCtrl': {
          template: '<orden-ctrl/>'
        },
        'piepagina':{
           template: '<piepagina/>'
         },
        'encabezado': {
            template: '<encabezado/>'
          }
        }
    })

//-----------------INICIO CREACIÓN Y LLAMADO DE LAS VISTAS DE LA RUTA PARA LISTAR-----------//
      .state('listaIngresos', {
        url: '/listaIngresos',
        views: {
          'listaIngresos': {
            template: '<lista-ingresos/>'
          },
          'piepagina': {
            template: '<piepagina/>'
          },
          'encabezado': {
            template: '<encabezado/>'
          }

        }

      })
//---------------FIN CREACIÓN Y LLAMADO DE LAS VISTAS DE LA RUTA PARA LISTAR------------//


//---------------INICIO CREACIÓN Y LLAMADO DE LAS VISTAS DE LA RUTA PARA CREAR-----------//
      .state('createIngresos', {
        url: '/createIngresos',
        views: {
          'createIngresos': {
            template: '<create-ingresos/>'
          },
          'piepagina': {
            template: '<piepagina/>'
          },
          'encabezado': {
            template: '<encabezado/>'
          }

        }

      })
//--------------FIN CREACIÓN Y LLAMADO DE LAS VISTAS DE LA RUTA PARA CREAR-------------//


//----------------INICIO CREACIÓN Y LLAMADO DE LAS VISTAS DE LA RUTA PARA ACTUALIZAR-----------//
      .state('updateIngresos', {
        url: '/updateIngresos/:idIngreso',
        views: {
          'updateIngresos': {
            template: '<update-ingresos/>'

          },
          'piepagina': {
            template: '<piepagina/>'
          },
          'encabezado': {
            template: '<encabezado/>'
          }

        }


      })
//-------------FIN CREACIÓN Y LLAMADO DE LAS VISTAS DE LA RUTA PARA ACTUALIZAR------------//

//----------------INICIO CREACIÓN Y LLAMADO DE LAS VISTAS DE LA RUTA PARA EL ACTA-------------//
      .state('actaIngresos', {
        url: '/actaIngresos/:idIngreso',
        views: {
          'actaIngresos': {
            template: '<acta-ingresos/>'

          },
          'piepagina': {
            template: '<piepagina/>'
          },
          'encabezado': {
            template: '<encabezado/>'
          }

        }


      });
//----------------FIN CREACIÓN Y LLAMADO DE LAS VISTAS DE LA RUTA PARA EL ACTA-------------//

  };
})();
