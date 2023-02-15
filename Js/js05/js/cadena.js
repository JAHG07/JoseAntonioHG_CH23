let texto  = "Hola Mundo";
// let mensaje = "El texto tiene " + texto.length + " caracteres";
// console.log(mensaje);
let mensaje =" ";

for (let index = 0; index < texto.length; index++) {
    mensaje += texto[index] + " ";
}
console.log(mensaje);
mensaje = mensaje.trimEnd();
console.log(mensaje.toUpperCase());

let txt = "Hoal mundo";
console.log(txt.substring(5,7));

let txxt = "Hoal mundo";
console.log(txxt.split(" "));