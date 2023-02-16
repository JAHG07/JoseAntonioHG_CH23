// let botonsuma = document.getElementById("botonsum");
// console.log(botonsuma);
// let boton  = document.getElementsByTagName("button");
// console.log(boton);
// console.log("Este es el promer elemento de la coleccion boton "+boton[0]);
// let clase = document.getElementsByClassName("botones");
// console.log(clase);


//construir calculadora
const valor0  =document.querySelector("#input0");
const valor1  =document.querySelector("#input1");
console.log(valor0);
console.log(valor1);

const botonsuma = document.querySelector("#botonsum")
const botonresta = document.querySelector("#botonres")
const botonmulti = document.querySelector("#botonmul")
const botondiv = document.querySelector("#botondiv")

const resultado = document.querySelector("#resultado");
resultado.textContent = "Cambie el texto man";


const imagen = document.createElement("img");
imagen.src = "https://www.petdarling.com/wp-content/uploads/2021/01/cachorros.jpg";
// imagen.setAttribute("alt","perrito");
imagen.alt = "Foto de un perrito";
imagen.className = "ImgPerr";
imagen.style.width = "300px";
document.body.append(imagen);