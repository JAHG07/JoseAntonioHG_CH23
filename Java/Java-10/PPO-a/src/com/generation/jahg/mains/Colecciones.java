package com.generation.jahg.mains;
import java.util.*;


public class Colecciones {
	public static void main(String[] args) {
		ArrayList <String> coleccion = new ArrayList();
		coleccion.add("Colecciones");
		/*
		coleccion.add(13);
		coleccion.add(15.5);
		coleccion.add('a');
		*/
		for (int i = 0; i < coleccion.size(); i++) {
			System.out.println(coleccion.get(i));
		}
	}
}
