package ejemplo2Sinch;

public class principal {

	public static void main(String [] args) {
		proceso hilo1 = new proceso("Hilo1");
		proceso2 hilo2 = new proceso2(hilo1);
		proceso2 hilo3 = new proceso2(hilo2);
		hilo1.start();
		hilo2.start();
		hilo3.start();
	}
}
