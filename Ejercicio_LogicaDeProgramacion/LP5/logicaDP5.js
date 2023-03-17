const adivinado = document.querySelector(".adivina");

class Numero {
    constructor(numero){
        this.numero = numero;
        this.VariableNumeroAleatorio;
    }
    adivinar(){
        if(VariableNumeroAleatorio == this.numero){
            adivinado.innerHTML = "<h2>Adivinaste</h2>";
        }
        else if(this.numero > numero){
            adivinado.innerHTML = "<h2>Es menor que eso</h2>";
        }
        else if(this.numero < numero){
            adivinado.innerHTML = "<h2>Es mayor que eso</h2>";
        }
        else{
            adivinado.innerHTML = "<h2>Esta fuera del rango</h2>";
        }
    }
    validar(valor) {
        return !isNaN(parseFloat(valor)) && isFinite(valor);
    }
    rango(){
        while(this.esnumero <= 1 || this.esnumero >= 100){
        }
    }
    generarAleatorio(){
        let VariableNumeroAleatorio = Math.floor(Math.random() * 100) + 1
    }
}

let valorDelUsuairo = new Numero(20);
//let numeroAdiv = parseIint(prompt("Adivina el numero del 1 al 100 : "));

