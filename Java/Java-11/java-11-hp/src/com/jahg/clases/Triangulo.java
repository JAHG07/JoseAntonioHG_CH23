package com.jahg.clases;

public class Triangulo extends FigurasGeometricas{
	private double base;
	private double altura;
	
	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public Triangulo(double base, double altura) {
		super("Triangulo");
		this.base = base;
		this.altura = altura;
	}


	public Triangulo() {
		super("Triangulo");
	}


	@Override
	public double areas() {
		// TODO Auto-generated method stub
		return base*altura/2;
	}


	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		
	}
	
	
}
