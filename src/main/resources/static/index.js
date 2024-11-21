angular.module('app', []).controller('ProductController', function ($scope, $http) {
    const contextPath = 'http://localhost:8189/app';

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
    $scope.filterNewPrice = function(){
   console.log($scope.newPrice)
    $http( {
url:contextPath + '/products/filterNewPrice',
method: 'GET',
params:{
min: $scope.newPrice.min,
max: $scope.newPrice.max
}
}).then(function (response){
console.log(response);
$scope.Products = response.data;
      });
    }
$scope.loadProducts();
});