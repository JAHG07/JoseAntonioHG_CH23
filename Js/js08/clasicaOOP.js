class Barcelona{
    constructor(nombre,edad,posicion){
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }
    saludar() {
        console.log(`¡Hola!, soy ${this.nombre}`);
     }
}

let jose = new Barcelona("Jose",22,"delantero");
let karime = new Barcelona("Karime",28,"Defensa");
console.log(jose.edad);
console.log(karime.edad);
jose.saludar();
karime.saludar();


