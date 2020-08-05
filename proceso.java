package ejemplo2Sinch;

public class proceso extends Thread {

	public proceso (String msg) {
		super(msg);
	}

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Ejecuci�n Proceso " + this.getName());
		}
	}
}
