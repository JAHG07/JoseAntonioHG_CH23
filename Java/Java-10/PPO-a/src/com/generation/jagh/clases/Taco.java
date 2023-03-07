package com.generation.jagh.clases;

public class Taco {
	private String tipoTaco;
	private String guisado;
	private int numTortillas;
	private String tamTort;
	public Taco() {
		super();
	}
	private float precio;
	
	public String getTipoTaco() {
		return tipoTaco;
	}
	public String setTipoTaco(String tipoTaco) {
		return this.tipoTaco = tipoTaco;
	}
	public String getGuisado() {
		return guisado;
	}
	public void setGuisado(String guisado) {
		this.guisado = guisado;
	}
	public int getNumTortillas() {
		return numTortillas;
	}
	public void setNumTortillas(int numTortillas) {
		this.numTortillas = numTortillas;
	}
	public String getTamTort() {
		return tamTort;
	}
	public void setTamTort(String tamTort) {
		this.tamTort = tamTort;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
}
