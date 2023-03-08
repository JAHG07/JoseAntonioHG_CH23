package com.generation.jahg.Manejo.Exepciones;
import java.util.*;
public class NoComprobateExceptions {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		System.out.print("Introduzca un valor ");
		
		try {
			int divisor = Integer.parseInt(dato.next());
			int division = 10 / 0;
			System.out.println(division);
		}catch(ArithmeticException e) {
			System.out.println("No se puede men es un :" + e.getMessage());
		}catch(NumberFormatException nfe) {
			System.out.println("No se puede men es un :" + nfe.getMessage());
		}finally{
			System.out.println("Soy el finally");
		}
		System.out.println("sigue na mas");
	}
	
}
