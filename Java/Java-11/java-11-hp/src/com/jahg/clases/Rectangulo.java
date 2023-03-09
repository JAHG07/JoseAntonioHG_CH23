package com.jahg.clases;

public class Rectangulo extends FigurasGeometricas{
	private double base;
	private double altura;
	@Override
	public double areas() {
		// TODO Auto-generated method stub
		return base*altura;
	}
	
	public Rectangulo(double base, double altura) {
		super("Rectangulo");
		this.base = base;
		this.altura = altura;
	}

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

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}

}
