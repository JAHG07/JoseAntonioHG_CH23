//Hacer calculadora
//Funciones normales
//1. Pedir datos 
function calculadora() {
    let a = parseInt( prompt( "Introduce número, plis: " ) )
    let b = parseInt( prompt( "Introduce otro número, plis: " ) )
    //2. Explicarle al usuario que escoga entre un 1 y 4 para que selecciones su tipo de operador que quiere
    let c = parseInt( prompt( "Introduce un número del 1 = suma, 2 = resta, 3= multiplicacion y 4 =divison, plis: " ) )
    switch ( c ) { //Aquí el switch pide el valor principal
        case 1: suma(a,b); //llamamos suma
            break;
        case 2: resta(a,b); //llamamos a la resta
            break;
        case 3: multiplicacion(a,b); //lammamos a la multiplicacion
            break;
        case 4: division(a,b); //llamamos a la división
            break;
        default: alert( "Introduce un número del 1 al 4: " );
            calculadora();
            break;
    }
}

//SUMA
function suma(a,b) {
    let sum1 = a + b //lo guardamos en otra variable para poder verlo en el console.log();
    console.log( sum1 );
}

//RESTA
function resta(c,d) {
    let rest1 = d - c
    console.log( rest1 );
}
//MULTIPLICACIÓN
function multiplicacion(e,f) {
    let mult = e * f
    console.log( mult );
}
//DIVISIÓN
function division( g, h ) {
    let div = g / h
    console.log( div );
}

calculadora();

//Hoisting
console.log(edad);
let edad = 22;

//Funciones anonimas 
let x = function(){}

//Funciones flecha
let suma = (a)=>{};

//funcion de area
function area(){
    let lado = 5;
    let area = lado**2;
    return area
}

console.log("EL area es : " +area());

// Por que son importantes las funciones?
//     - Nos permite reutilizar codigo en lugar de escribirlo varias veces. Podemos llamar nuestra funcion en distintos lugares de nuestro programa, y así lo usamos cuando lo necesitamos sin necesidad de escribirlo de nuevo.
//     - Nos permite modularizar nuestro codigo, esto es, dividir nuestra aplicacion en partes mas pequeñas e independientes. Así mejoramos el entendimiento y comprensión del código.
//     - Mantienen su propio espacio, y las variable que se encuentran dentro de una funcion no se pueden acceder fuera de ella (scope).
//     - Por que podemos probar pequeñas partes de nuestro programa de forma aislada. (Debugging)

/*
    tipos de funciones 
    Funciones directas -Nombre(comunes)
    Funciones anonimas - viven pegadas a una variable 
    Funciones como metodos (para espesificar que hace un objeto)
    Funciones constructoras (para construir o crear un objeto)
*/