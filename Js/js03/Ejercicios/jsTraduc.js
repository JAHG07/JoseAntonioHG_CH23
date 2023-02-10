let dias = ["Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"];

let disNumero = parseInt(prompt("Dame el dia : "));
if(disNumero > 6 || disNumero < 0)console.log("Numero no valido");
else console.log("El dia es " + dias[disNumero]);