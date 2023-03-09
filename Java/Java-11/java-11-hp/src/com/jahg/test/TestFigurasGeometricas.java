package com.jahg.test;
import com.jahg.clases.*;


public class TestFigurasGeometricas {
	public static void main(String[] args) {
		FigurasGeometricas rec = new Rectangulo(10, 2);
		FigurasGeometricas cir = new Circulo(10);
		FigurasGeometricas tri = new Triangulo(10,2);
		System.out.println(rec.areas());
		System.out.println(cir.areas());
		System.out.println(tri.areas());
		System.out.println(rec.toString());
		
		rec.pedirDatos();
		System.out.println(rec.toString());
		System.out.println(rec.areas());
	}
}
