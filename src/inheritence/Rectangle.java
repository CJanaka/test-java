package inheritence;

public class Rectangle extends Shapes {

	private int width;
	private int height;

	public Rectangle(String color,int width,int height) {
		super(color);
		this.height = height;
		this.width = width;
	}

	@Override
	public double calArea() {
		return (width * height);
	}

	@Override
	public double calPerimitter() {
		return (width + height)*2;
	}

	@Override
	public String toString() {
		return "Rectangle is createdwith Colour "+super.getColor()+ " .Width = " + width + " ,Area = " + calArea() + " ,Perimitter" + calPerimitter()
				+ super.getColor();
	}

}
