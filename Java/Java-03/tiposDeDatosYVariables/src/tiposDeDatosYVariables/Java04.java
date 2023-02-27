package tiposDeDatosYVariables;

public class Java04 {
	public static void main(String[] args) {
		int edad = 18;
		boolean tieneLicencia = true;
		if (edad >= 18 && tieneLicencia) {
		    System.out.println("Puede conducir un coche");
		} else {
		    System.out.println("No puede conducir un coche");
		}
		String nombre = "Juan";
		String apellido = "Pérez";
		if (nombre.equals("Juan") || apellido.equals("Pérez")) {
		    System.out.println("El usuario es Juan Pérez");
		} else {
		    System.out.println("El usuario no es Juan Pérez");
		}
		boolean esVerdadero = true;
		if (!esVerdadero) {
		    System.out.println("La condición es falsa");
		} else {
		    System.out.println("La condición es verdadera");
		}
		
		//¿Es un número positivo y menor que 10?
		byte num = 5;
		System.out.print("Es :" + (num>0 && num<10));
		//¿Es un número par o múltiplo de 3?
		byte num1 = 5;
		System.out.print("Es multiplo de 3:" + (num1%3));
		//¿Es un número negativo o igual a cero?
		System.out.print("Es neagtivo o igual a 0:" + (num1<=0));
	}
}
