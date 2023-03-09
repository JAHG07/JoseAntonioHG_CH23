package com.jahg.clases;

public class Suma implements OperacionesAritmeticas , Mensaje{
private double a;
private double b;



	public Suma() {
	super();
}

	public Suma(double a, double b) {
	super();
	this.a = a;
	this.b = b;
}

	@Override
	public double sumar() {
		// TODO Auto-generated method stub
		return this.a+this.b;
	}

	@Override
	public double restar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void mensaje() {
		// TODO Auto-generated method stub
		System.out.println("Este es un mensaje");
	}

}
