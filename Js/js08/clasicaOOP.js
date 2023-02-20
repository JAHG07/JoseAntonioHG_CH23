class numeros {
    numero0 = 5;
    numero1 = 0;

    constructor(valor0,valor1){
        this.numero0 = valor0;
        this.numero1 = valor1;
    }

    sumar(a,b){return a+b}
}

let obj4 =new numeros(8, 6) ;

let obj3 = new numeros();
obj3.numero0 = 8;
obj3.numero1 = 5;
console.log(obj3.sumar(obj3.numero0, obj3.numero1));

let obj2 = new numeros();
console.log(obj2.sumar(5, 6));

let objeto = new numeros();
console.log(objeto.numero0);