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

/* 
metodos para acceder a elementos 
    get element by ID
                    Classname
                    Tagname

metodos para crear a elementos 
    createElement
    createTextNode

metodos para insertar a elementos 
    parentElemnt.append
                .insertBefore
                .insertAdjacetElemet

metodos para modificar a elementos 
    node.outerHTML (leer o referenciar el elemento)
    node.innerHTML (modificar el elemnto)
    
*/ 

const azul = document.querySelector("#botonsum");
function cambiarCoIor(color){
    azul.style.color = color;
}



botonsuma.addEventListener("click",()=>{
    let val1 = parseInt(valor0.value);
    let val2 = parseInt(valor1.value);
    let suma = val1+val2;
    console.log(valor0.value);
    resultado.innerHTML = suma;
})
botonresta.addEventListener("click",()=>{
    let val1 = parseInt(valor0.value);
    let val2 = parseInt(valor1.value);
    let suma = val1-val2;
    console.log(valor0.value);
    resultado.innerHTML = suma;
})
botonmulti.addEventListener("click",()=>{
    let val1 = parseInt(valor0.value);
    let val2 = parseInt(valor1.value);
    let suma = val1*val2;
    console.log(valor0.value);
    resultado.innerHTML = suma;
})
botondiv.addEventListener("click",()=>{
    let val1 = parseInt(valor0.value);
    let val2 = parseInt(valor1.value);
    let suma = val1/val2;
    console.log(valor0.value);
    resultado.innerHTML = suma;
})
