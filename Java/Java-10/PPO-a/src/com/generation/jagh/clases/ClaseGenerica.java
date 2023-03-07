package com.generation.jagh.clases;

public class ClaseGenerica <T> {
	T obj;
	
	public ClaseGenerica(T obj) {
		this.obj = obj;
	}
	public void calseTipo() {
		System.out.println("el tipo de clase es :" +obj.getClass().getCanonicalName());
	}
}
