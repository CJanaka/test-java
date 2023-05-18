package inheritence;

public abstract class Shapes {

	private String color;
	
	public String getColor() {
		return this.color;
	}
	
	public Shapes(String color) {
		this.color = color;
	}
	public abstract double calArea();
	
	public abstract double calPerimitter();
			
	public abstract String toString();
}
