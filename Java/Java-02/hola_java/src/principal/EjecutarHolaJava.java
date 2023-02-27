package principal;
import java.util.Scanner;

import clases.hola_java;

public class EjecutarHolaJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//hola_java objHJ1 = new hola_java();
		//objHJ1.saludo();
		//NuevoHola objt2 = new NuevoHola("Jose");
		//objt2.saludo();
		String nombre;
		System.out.print("Cual es tu nombre: ");
		nombre = sc.next();
		NuevoHola nuevo1 = new NuevoHola();
		nuevo1.saludoConNombre(nombre);
		
	}

}
