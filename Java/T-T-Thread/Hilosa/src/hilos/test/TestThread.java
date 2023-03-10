package hilos.test;

import hilos.formathread.hilo1;

public class TestThread {
	public static void main(String[] args) {
		Thread h = new hilo1("Primero");
		h.start();
		Thread h0 = new hilo1("Segundo");
		h0.start();
		Thread h1 = new hilo1("Tercero");
		h1.start();
		System.out.println("El estado es "+ h.getState());
		
		System.out.println("El estado es "+ h.getState());
	}
}
