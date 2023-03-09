package com.jahg.test;
import com.jahg.clases.*;

public class TestOpercaionesAritmeticas {
	public static void main(String[] args) {
		Suma s = new Suma(5,5);
		OperacionesAritmeticas ss = new Suma(5,2);
		System.out.println(s.sumar());
		System.out.println(ss.sumar());
		Mensaje men = new Suma();
		men.mensaje();
	}
}
