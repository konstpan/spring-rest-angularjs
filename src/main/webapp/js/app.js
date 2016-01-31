'use strict';

var gameCatalogApp = angular.module('gameCatalogApp', ['ngRoute', 'gameCatalogControllers']);

gameCatalogApp.config(function($routeProvider) {
  $routeProvider.
    when('/games', {
      templateUrl: 'partials/game-list.html',
      controller: 'GameListCtrl'
    }).
    when('/games/:gameId', {
      templateUrl: 'partials/game-detail.html',
      controller: 'GameDetailCtrl'
    }).
    otherwise({
      redirectTo: '/games'
    });
  }
);