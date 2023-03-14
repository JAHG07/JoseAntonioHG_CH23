let palabra = "Hola"
let array = ["Como","Donde","Miguel","Alonso","Mario"]
let arr = [];

const longitud = (palabra,array)=>{
    for(e of array){
        if(palabra.length < e.length) arr.push(e);
    }
}

longitud(palabra,array);
console.log(arr);