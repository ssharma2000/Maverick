const fs = require('fs');

const content = fs.readFileSync(__filename); // blocking api

console.log(content.toString());