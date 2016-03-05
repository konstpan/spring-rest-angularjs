'use strict';

var gameCatalogControllers = angular.module('gameCatalogControllers', []);

gameCatalogControllers.controller('GameListCtrl', 
  function($scope, $http) {
    $http.get('/api/games').success(function(data) { $scope.games = data; });
  }
);

gameCatalogControllers.controller('GameDetailCtrl', 
  function($scope, $http, $routeParams) {
    $http.get('/api/game/' + $routeParams.gameId).success(function(data) { $scope.game = data; });
  }
);