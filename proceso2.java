package ejemplo2Sinch;

public class proceso2 extends Thread{

	private Thread hilo;

	public proceso2(Thread hilo_) {
		this.hilo=hilo_;
	}

	@Override
	public void run() {
		try {
			hilo.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i <=10 ; i++) {
			System.out.println("Ejecuci�n Proceso " + this.getName());
			System.out.println("");
		}
	}
}
