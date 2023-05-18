package polymorphism;

public class Calculator {
	
	public static double add(int a, int b) {
		return a+b;
	}
	
	public static double add(int a, double b) {
		return a+b;
	}
	
	public static double add(double a, double b) {
		return a+b;
	}
	
	public static double add(double a, int b) {
		return a+b;
	}

}
