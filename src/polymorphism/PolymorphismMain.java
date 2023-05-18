package polymorphism;

public class PolymorphismMain {

	public static void main(String[] args) {
		double retValue = Calculator.add(5.5, 2.3);
		System.out.println(retValue);
		
		Car car = new Car(0, null, null, 0, 0, null);//Constructor overloading

		//Dynamic polymorphism
		
		Vehicle vehicle = new Vehicle();
		vehicle.getSpeed();
		
		Cars cars = new Cars();
		cars.getSpeed();
		
		Vehicle veh = new Cars();
		veh.getSpeed();
	}

}
