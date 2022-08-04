// HOF; action is a function
function forEach(elems, action) {
    for(var i = 0; i < elems.length; i++) {
        action(elems[i]);
    }
}

function map(elems, transformFn) {
    var result = [];
        forEach(elems, function(elem) {
            result.push(transformFn(elem));
        });
    return result;
}