package hilos.test;

import hilos.formaRunable.Hilo2;

public class TestRunnable {
	public static void main(String[] args) {
		Hilo2 ht = new Hilo2("Juan");
		Thread st = new Thread(ht);
		st.start();
		
		new Thread(new Hilo2("Carlos")).start();
		new Thread(new Hilo2("Mariano")).start();
	}
}
