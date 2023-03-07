package com.generation.jagh.clases;

public class TacoMth {
	Taco tc = new Taco();
	public double vender(int cantidad) {
		return cantidad*tc.getPrecio();
	}
	public void preparar(String deQue) {
		tc.setTipoTaco(deQue);
	}
	public boolean si(boolean salsa) {
		salsa = true;
		return salsa;
	}
	public void subirPrecio(float nuevo) {
		tc.setPrecio(nuevo);
	}
}
