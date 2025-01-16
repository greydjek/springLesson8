angular.module('app', []).controller('ProductController', function ($scope, $http) {
    const contextPath = 'http://localhost:8189/app/api/v1';

//    $scope.loadProducts = function () {
//        $http.get(contextPath + '/products')
//            .then(function (response) {
//            console.log(response);
//                $scope.Products = response.data;
//            });
               $scope.loadProducts = function (pageIndex = 1) {
                    $http({
                        url: contextPath + '/products',
                        method: 'GET',
                        params: {
                            title_part: $scope.filter ? $scope.filter.title_part : null,
                            min_price: $scope.filter ? $scope.filter.min_price : null,
                            max_price: $scope.filter ? $scope.filter.max_price : null
                        }
                    }).then(function (response) {
                    console.log(response);
                        $scope.ProductsPage = response.data;
                    });
                };


    $scope.productsInCart = function () {
        $http.get(contextPath + '/productsInCart')
            .then(function (response) {
            console.log(response);
                $scope.ProductsInCart = response.data;

            });

    };
 $scope.addProductInCart = function (id) {
 console.log(id)
        $http.get(contextPath + '/addProductInCart/' + id)
            .then(function (response) {
            console.log(response);
                $scope.ProductsInCart();

            });

    };

    $scope.deleteProductInCart = function (id) {
        $http.get(contextPath + '/deleteProductInCart/' + id)
            .then(function (response) {
            console.log(response);
                $scope.ProductsInCart = response.data;
            });

    };
$scope.loadProducts();
});
