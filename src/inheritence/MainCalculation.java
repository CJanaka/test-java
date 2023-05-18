package inheritence;

public class MainCalculation {

	public static void main(String[] args) {
		Square sq = new Square("blue", 5);
		System.out.println(sq.calArea());

		Circle c = new Circle("Red", 7);
		System.out.println(c.calArea());

		Rectangle rect = new Rectangle("Yellow", 10, 5);
		System.out.println(rect.calArea());

	}

}
