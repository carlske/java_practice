var converhexa = function(name) {
    return "conversion hexadecimal " + parseInt(name).toString(16);
};

var converbinario = function(name) {
    return "conversion binario " + parseInt(name).toString(2);
};

var converoctal = function(name) {
    return "conversion Octal  " + parseInt(name).toString(8);
};

var arra = new Array();
var addpila = function(name) {
     arra.push(name);
    return "Numero insertado en pila "+ name;
};

var showpila = function(name) {
    return arra.toString();
};

var ordenar = function() {
    arra.sort();
    return "Array ordenado"
};





