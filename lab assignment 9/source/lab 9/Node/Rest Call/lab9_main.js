/**
 * Created by Advaith on 10/26/2016.
 */


var express = require('express');
var app = express();
var request = require('request');


app.get('/ingre',function (reg,res){
    var result={
        'ing':[]
    };
    request('http://api.foodessentials.com/ingredientsearch?q=chicken&sid=6982c2b5-79ff-4d55-929c-b303a18d1e87&n=10&s=1&f=json&api_key=wvq3xzw9pxdpfqk7ywa6sdfp', function (error, response, body) {
        if(error){
            return console.log('Error:', error);

        }
        if(response.statusCode !=200){
            return console.log('invalid status code returned:', response.statusCode);

        }
        body = JSON.parse(body);
        var ing = body.arrayIngredients;
        for(var i=0; i<ing.length; i++)
        {
            console.log(i);
            result.ing.push({'ing_name':ing[i].ingredient_name});


        }
        res.contentType('application/json');
        res.write(JSON.stringify(result));
        res.end();

    });
    console.log(result);

})
app.listen(1337);
var server = app.listen(8050, function () {
    var host = server.address().address
    var port = server.address().port

    console.log("jb at http://%s:%s", host, port);
})