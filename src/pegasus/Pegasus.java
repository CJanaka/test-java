package pegasus;

public class Pegasus extends Horse implements Birds {

	@Override
	public void fly() {
		System.out.println("Bird can fly");
		
	}

	@Override
	public void run() {
		System.out.println("Hourse can run");
		
	}

}
