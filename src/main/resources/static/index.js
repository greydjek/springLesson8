angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:8089/app';

    $scope.loadProducts = function () {
        $http.get(contextPath + '/products')
            .then(function (response) {
            console.log(response);
                $scope.Products = response.data;
            });
    };

    $scope.changePrice = function(id, delta){
    $http( {
url:contextPath + '/products/changePrice',
method: 'GET',
params:{
id: id,
delta: delta
}
}).then(function (response){
        $scope.loadProducts();
      });
    }

    $scope.loadProducts();
});