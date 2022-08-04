const fs = require('fs');

const stream = fs.createReadStream("Promise1.html");

stream.on('data', (chunk) => {
    console.log(chunk.toString()); // n times ==> 16kb
});

stream.on('end', () => {
    console.log("Next Episode >>");
});

stream.on('error', (err) => {
    console.log("Error ", err);
});