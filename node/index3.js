var express = require("express");
var app = express();
var fs = require('fs');

app.get("/message", function (request, response) {
    response.sendFile(__dirname + "/message.html");
});

app.get("/getmessage", function (request, response) {
    var data = request.query.location + ',' + request.query.message.replace(/\n/g, " ") + "\r\n";
    fs.appendFileSync('messages.txt', data);
    response.sendFile(__dirname + "/thankyou.html");
});

//start the server
app.listen(6000);