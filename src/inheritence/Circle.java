package inheritence;

public class Circle extends Shapes{


	private double radius;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double calArea() {
		return (Math.PI*(radius*2));
	}

	@Override
	public double calPerimitter() {

		return (2*Math.PI*radius);
	}

	@Override
	public String toString() {

		return "Circle is created with Colour "+super.getColor()+" ,Radius = " + radius + " ,Area = " + calArea() +",Perimitter" + calPerimitter()
		+ super.getColor();
	}

}
