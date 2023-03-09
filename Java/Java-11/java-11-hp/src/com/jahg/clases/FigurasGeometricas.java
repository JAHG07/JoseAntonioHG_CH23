package com.jahg.clases;

public abstract class FigurasGeometricas {
	private String nombre;
	
	
	public FigurasGeometricas(String nombre) {
		super();
		this.nombre = nombre;
	}


	public abstract double areas();
}
