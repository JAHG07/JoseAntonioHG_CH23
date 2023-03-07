package com.generation.jagh.clases;

public class AreaPerimetro {

	public double area(double lado) {
		double area = lado * lado;
		return area;
	}
	public double perimetro(double lado) {
		double peri = lado * 4;
		return peri;
	}
	
	public double areaTri(int base , int altura ) {
		return (base*altura)/2;
	}
	public double permTri(double ladoa,double ladob ,double ladoc  ) {
		return ladoa+ladob+ladoc;
	}
	
	public double areaCirculo(double radio) {
		return (Math.pow(radio,2)*Math.PI);
	}
	public double permCir(double radio) {
		return (radio*2*Math.PI);
	}
}
