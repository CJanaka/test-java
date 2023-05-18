package inheritence;

public class Square extends Shapes {
	private int width;

	public Square(String color,int width) {
		super(color);
		this.width = width;
	}

	@Override
	public double calArea() {
		return (width * width);
	}

	@Override
	public double calPerimitter() {

//		return Math.pow(width, 2);
		return width * 4;
	}

	@Override
	public String toString() {
		return "Squre is created Colour "+super.getColor()+ " ,Width = " + width + " ,Area = " + calArea() + " ,Perimitter" + calPerimitter()
				+ super.getColor();
	}

}
