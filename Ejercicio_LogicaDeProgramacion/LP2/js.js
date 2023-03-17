// Debe solicitar al usuario 3 números por prompt y guardarlos en sus respectivas variables.
// Debe analizar los números, identificar cual es el número mayor, el número del centro y el número menor.
// Debe imprimir los números por consola o por el DOM ordenados de mayor a menor, y de menor a mayor.
// Debe ser capaz de identificar si los números son iguales e imprimir un mensaje por consola o por el DOM diciendo que los números son iguales.

let temp = parseInt(prompt("Dame una temperatura en Celcius"));

if(!isNaN(temp)){
    console.log(`La temp en F es: ${(temp * (9/5)) + 32}`);
    console.log(`La temp en K es: ${temp+273.15}`);
}else console.log("No es un numero");





