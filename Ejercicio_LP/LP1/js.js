// Debe solicitar al usuario 3 números por prompt y guardarlos en sus respectivas variables.
// Debe analizar los números, identificar cual es el número mayor, el número del centro y el número menor.
// Debe imprimir los números por consola o por el DOM ordenados de mayor a menor, y de menor a mayor.
// Debe ser capaz de identificar si los números son iguales e imprimir un mensaje por consola o por el DOM diciendo que los números son iguales.

let num1 = [];
for (let i = 0; i < 3 ; i++) {
    num1[i] =parseInt(prompt("Dame un numero"));
}
num1.sort((a,b)=>a - b);
console.log(num1);
if((num1.some((a,i)=>a==num1[i+1])))console.log("Hay repetidos");
num1.sort((a,b)=>b - a);
console.log(num1);







