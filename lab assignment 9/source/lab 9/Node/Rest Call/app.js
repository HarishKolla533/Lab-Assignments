'use strict';

// Declare app level module which depends on views, and components
angular.module('myApp', [])


    .controller('View1Ctrl', function ($scope, $http) {
        $scope.venueList = new Array();
        $scope.mostRecentReview;
        console.log("rfjgfyhz1");
        $scope.getVenues = function () {
            var placeEntered = document.getElementById("textboxer").value;

            // var searchQuery = document.getElementById("txt_searchFilter").value;
            if (placeEntered != null ) {
                console.log("rfjgfyhz2  ");
                //This is the API that gives the list of venues based on the place and search query.
                var handler = $http.get("http://api.foodessentials.com/ingredientsearch?q=" + placeEntered + "&sid=6982c2b5-79ff-4d55-929c-b303a18d1e87&n=10&s=1&f=json&api_key=wvq3xzw9pxdpfqk7ywa6sdfp");
                handler.success(function (data) {
                    console.log("rfjgfyhz3 ");
                    if (data != null && data.response != null && data.response.venues != undefined && data.response.venues != null) {
                        console.log("rfjgfyhz");
                        for (var i = 0; i < data.response.venues.length; i++) {
                            $scope.venueList[i] = {
                                "name": data.response.venues[i].name,
                                "id": data.response.venues[i].id,
                                "location": data.response.venues[i].location
                            };
                        }
                    }

                })
                handler.error(function (data) {
                    alert("There was some error processing your request. Please try after some time.");
                });
            }
            ;
        }
    });