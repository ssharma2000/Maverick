const fs = require('fs');

// non-blocking api
 fs.readFile("Person.html", (err, data) => {
    if(!err) {
        console.log(data.toString());
    }
 }); 

console.log("Bye!!!");