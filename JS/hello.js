const { log } = require("console");
var http = require("http");

http.createServer(function (request, response) {
   // Send the HTTP header 
   // HTTP Status: 200 : OK
   // Content Type: text/plain
   response.writeHead(200, { 'Content-Type': 'text/plain' });

   // Send the response body as "Hello World"
   response.end('Hello World\n');
}).listen(8081);
///////////      ===============================================================
name = "MARVIN"
function GFG(name) {   console.log("hello " + name);}
// No parameters are passed 
x = GFG(name);
function reverse(str){   let reversed = "";    
   for (var i = str.length - 1; i >= 0; i--){      
     reversed += str[i];
   }    

   console.log(reversed);
   return reversed;
 }



// Console will print the message
console.log('Server running at http://127.0.0.1:8081/');