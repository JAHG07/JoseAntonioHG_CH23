let persona =  {
    nombre : "Jose" ,
    apellido : "Haro",
    nombreCompleto : function (){return `El nombre completo es ${this.nombre} ${this.apellido} `}
}
//console.log(persona);    
console.log(persona.nombre);
console.log(persona.nombreCompleto());