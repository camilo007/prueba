(function() {
  'use strict';

//------------------INICIO INYECCIÓN DE LAS DIRECTIVAS-------------------//
  angular.module('app.ingresos.directivas', [])
    .directive('listaIngresos', listaIngresos)
    .directive('createIngresos', createIngresos)
    .directive('updateIngresos', updateIngresos)
    .directive('actaIngresos', actaIngresos)
    .directive('ordenCtrl', ordenCtrl);
//--------------------FIN INYECCIÓN DE LA DIRECTIVAS---------------------//    

function ordenCtrl(){
  return {
    scope: {},
    templateUrl: 'app/ingresos/numOrden.html',
    controller: 'OrdenCtrl',
    controllerAs: 'vm'
  };
}




//----------------INICIO FUNCIÓN DE LA DIRECTIVA DE LISTAR---------------//

  function listaIngresos() {
    return {
      scope: {},
      templateUrl: 'app/ingresos/listaIngresos.html',
      controller: 'ListaIngresos',
      controllerAs: 'vm'
    };
  }

//-------------FIN FUNCIÓN DE LA DIRECTIVA DE LISTAR--------------------//  



//--------------INICIO DE LA FUNCIÓN DE LA DIRECTIVA DE CREAR--------------//
  function createIngresos() {
    return {
      scope: {},
      templateUrl: 'app/ingresos/crearIngresos.html',
      controller: 'CreateIngresos',
      controllerAs: 'vm'
    };
  }
//--------------FIN DE LA FUNCIÓN DE LA DIRECTIVA DE CREAR---------------//


//--------------INICIO DE LA FUNCIÓN DE LA DIRECTIVA DE ACTUALIZAR----------//
  function updateIngresos() {
    return {
      scope: {},
      templateUrl: 'app/ingresos/update.html',
      controller: 'UpdateIngresos',
      controllerAs: 'vm'
    }
  }
//--------------FIN DE LA FUNCIÓN DE LA DIRECTIVA DE ACTUALIZAR-------------//  


//--------------INICIO DE LA FUNCIÓN DE LA DIRECTIVA DE ACTA---------------//
 function actaIngresos() {
    return {
      scope: {},
      templateUrl: 'app/ingresos/acta.html',
      controller: 'ActaIngresos',
      controllerAs: 'vm'
    }
  }
//------------FIN DE LA FUNCIÓN DE LA DIRECTIVA DE ACTA--------------//


})();
