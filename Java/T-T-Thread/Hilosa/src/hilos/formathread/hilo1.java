package hilos.formathread;

public class hilo1 extends Thread{
	public hilo1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		super.run();
		System.out.println("Se inicai el hilo" + this.getName());
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Se acabo el hilo" + this.getName());
	}

	
}
