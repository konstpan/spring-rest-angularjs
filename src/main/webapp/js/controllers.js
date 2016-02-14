'use strict';

var gameCatalogControllers = angular.module('gameCatalogControllers', []);

gameCatalogControllers.controller('GameListCtrl', 
  function($scope, $http) {
    $http.get('/api/games').success(function(data) { $scope.games = data; });
  }
);

gameCatalogControllers.controller('GameDetailCtrl', 
  function($scope, $routeParams) {
    $scope.gameId = $routeParams.gameId;
  }
);