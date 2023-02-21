class Persona {
    constructor(nombre,apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }
    set (nombre){
        this._nombre = nombre;
    }
    get (){
       return this._nombre; 
    }
    set (apellido){
        this._apellido = apellido;
    }
    get apellido (){
        return this._apellido;
    }
    nombreCompleto(){
        return `El nombre completo es ${this._nombre} ${this._apellido}`
    }
    toString(){
        return this.nombreCompleto();
    }
}

class Empleado extends Persona{
    constructor(nombre,apellido,departamento){
        super(nombre,apellido)
        this._departamento = departamento;
    }
    set (departamento){
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento;
    }
}

let persona5 = new Persona("Arturo","Rodrigez");
let persona6 = new Empleado("Arturo","Rodrigez","Departamento5");
console.log(persona6);
console.log(persona5.nombreCompleto());

// let persona1 = new Persona("Juan" , "Perez");
// let persona2 = new Persona("Maria" , "Jimenez");
// let persona3 = new Persona("Jhony" , "Deep");
// console.log(persona3.nombre) ;
// persona3.nombre = "Juan";
// persona3.apellido = "Lopez";

// console.log(persona1);
// console.log(persona2);