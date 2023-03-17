// Debe solicitar al usuario 3 números por prompt y guardarlos en sus respectivas variables.
// Debe analizar los números, identificar cual es el número mayor, el número del centro y el número menor.
// Debe imprimir los números por consola o por el DOM ordenados de mayor a menor, y de menor a mayor.
// Debe ser capaz de identificar si los números son iguales e imprimir un mensaje por consola o por el DOM diciendo que los números son iguales.

let num = parseInt(prompt("Dame un numero "));
let fac = 1;
if(!isNaN(num)){
    for (let i = 2; i <= num; i++) {
          fac = fac * i;
    }
    console.log(fac);
}else console.log("No es un numero");



