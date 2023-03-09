package com.jahg.clases;

public class Circulo extends FigurasGeometricas {
 private int radio;

public Circulo(int radio) {
	super();
	this.radio = radio;
}



public int getRadio() {
	return radio;
}



public void setRadio(int radio) {
	this.radio = radio;
}



public double areas() {
	// TODO Auto-generated method stub
	return Math.PI*Math.pow(radio, 2);
}

 
 
}
