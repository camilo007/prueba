(function() {

  'use strict';

//------------------INICIO INJECCIÓN DE LOS CONTROLADORES---------------//
  angular.module('app.ingresos.controller', [])
    .controller('ListaIngresos', ListaIngresos)
    .controller('CreateIngresos', CreateIngresos)
    .controller('UpdateIngresos', UpdateIngresos)
    .controller('ActaIngresos', ActaIngresos)
    .controller('IngreCtrl', IngreCtrl)
    .controller('OrdenCtrl', OrdenCtrl)
//-----------------FIN INJECCIÓN DE LOS CONTROLADORES-----------------//
   



   
/*.controller('AppCtrl', function($scope, $mdDialog) {
  $scope.openFromLeft = function() {
    $mdDialog.show(
      $mdDialog.alert()
        .clickOutsideToClose(true)
        .title('¿Esta seguro que desea eliminar éste registro de ingreso?')
        .ariaLabel('Left to right demo')
        .ok('Si')
        // You can specify either sting with query selector
        .openFrom('#left')
        // or an element
        .closeTo(angular.element(document.querySelector('#right')))
    );
  };
}); */











//----------------------------INICIO CONTROLADOR DE ORDEN---------------------------//

OrdenCtrl.$inject = ['Ingresos'];
function OrdenCtrl(Ingresos){
  var vm = this;

  function getNumOrden(){
    Ingresos.query().$promise.then(function(data){
      vm.num = data;
    });
  }
  vm.num = Ingresos.query();
}
//----------------------------FIN CONTROLADOR DE ORDEN----------------------------//






//-------------------------INICIO CONTROLADOR DE LISTAR---------------------------//
  ListaIngresos.$inject = ['Ingresos','$mdToast'];

  function ListaIngresos(Ingresos,$mdToast) {
    var vm = this;
   
    vm.eliminar = eliminar;
    getIngresos();

    function getIngresos() {
      Ingresos.query().$promise.then(function(data) {
        vm.ingresos = data;
      });
    }
    vm.ingresos = Ingresos.query();


   this.onChange = function(id) {
      Ingresos.inhabilit({
          idIngreso: id
        }).$promise
        .then(function(data) {
          $mdToast.show(
          $mdToast.simple()
            .textContent('Se ha cambiado el estado del equipo..')
            .position('bottom right'));
        })
        .catch(function(data) {
          console.log("no exito");
          console.log(data);
        })
    };


    function eliminar(idIngreso) {
      Ingresos.remove({
          idIngreso: idIngreso
        })
        .$promise.then(function() {
          getIngresos();
          $mdToast.show(
          $mdToast.simple()
            .textContent('Se ha Eliminado un registro de ingreso..')
            .position('bottom right'));
        });
    }
  }
//------------------------FIN DE CONTROLADOR DE LISTAR---------------------------//


//---------------------INICIO CONTROLADOR DE PAGINACIÓN----------------------------//
IngreCtrl.$inject = ['Ingresos', '$mdToast', '$location', 'SecurityFilter'];

  function IngreCtrl(Ingresos, IngresoService, $mdToast, $location,
    SecurityFilter) {
    var vm = this;
    vm.query = {
      limit: 6,
      page: 1
    };
    vm.ingresos = Ingresos.query()
  }
//-----------------------FIN CONTROLADOR DE PAGINACIÓN----------------------------//


  


//---------------INICIO CONTROLADOR DE CREAR------------------------------------------//
  CreateIngresos.$inject = ['Ingresos', '$location', 'Ciudades', '$mdToast'];

  function CreateIngresos(Ingresos, $location, Ciudades, $mdToast) {
    var vm = this;

    vm.create = create;
    vm.ciudades = Ciudades.query();


    function create() {
      Ingresos.save(vm.ingresos).$promise.then(function(data) {
        $location.path('/listaIngresos');
        $mdToast.show(
          $mdToast.simple()
            .textContent('Se ha guardado el Ingreso Exitosamente..')
            .position('bottom right'));
          
      });
    }
  }
//--------------------FIN DE CONTROLADOR DE CREAR-----------------------------------//





//--------------INICIO CONTROLADOR DE ACTUALIZAR------------------------------------//
  UpdateIngresos.$inject = ['$stateParams', '$location','Ingresos','Ciudades', '$mdToast'];

  function UpdateIngresos($stateParams, $location, Ingresos, Ciudades, $mdToast) {
    var vm = this;
    vm.ingreso = Ingresos.get({
      idIngreso: $stateParams.idIngreso
    });
    
vm.ciudades = Ciudades.query();
    vm.update = function() {
      Ingresos.update({
        idIngreso: vm.ingreso.idIngreso
      }, vm.ingreso).$promise
      .then(function(){
        $location.path('/listaIngresos');
         $mdToast.show(
        $mdToast.simple()
        .textContent('Se ha  actualizado el Ingreso Exitosamente...')
        .position('bottom right'));
      });
      

    }
  }
//-----------------------FIN CONTROLADOR DE ACTUALIZAR--------------------------//
  



//-------------------------INICIO CONTROLADOR DE ACTA-----------------------------------//
  ActaIngresos.$inject = ['$stateParams', '$location','Ingresos'];

  function ActaIngresos($stateParams, $location, Ingresos) {
    var vm = this;
    vm.ingres = Ingresos.get({
      idIngreso: $stateParams.idIngreso
    });


    vm.update = function() {
      Ingresos.update({
        idIngreso: vm.ingres.idIngreso
      }, vm.ingres);
      $location.path('/actaIngresos');
      $mdToast.show(
        $mdToast.simple()
        .textContent('Se ha  actualizado el ingreso...')
        .position('bottom right'));

    }
  }

//---------------------------FIN CONTROLADOR DE ACTA---------------------------------//  


})();
