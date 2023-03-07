package com.generation.jahg.mains;

import com.generation.jagh.clases.ClaseGenerica;

public class TestGeneric {
	public static void main(String[] args) {
		ClaseGenerica <Integer> intObj = new ClaseGenerica<Integer>(55);
		ClaseGenerica <String> strintObj = new ClaseGenerica<String>("hola");
		intObj.calseTipo();
		strintObj.calseTipo();
	}
}
