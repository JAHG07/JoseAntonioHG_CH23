package com.generation.jahg.Manejo.Exepciones;

public class Sivision {
	private int numerador;
	private int denominador;
	
	public Sivision(int numerador, int denominador)throws OpExceptions {
		if (denominador == 0 ) {
			throw new OpExceptions("El denominador es 0"); 
		}
		this.numerador = numerador;
		this.denominador = denominador;
	}
	public void visualozar() {
		System.out.println("El resultado de la division es :" + (this.numerador/this.denominador));
	}
}
