package polymorphism;

public class Car {

	private long carId;
	private String make;
	private String model;
	private int yom;
	private int noOfSeat;
	private String carCategory;
	
	// All car arg constructor
	public Car(long carId, String make, String model, int yom, int noOfSeat, String carCategory) {

		this.carId = carId;
		this.make = make;
		this.model = model;
		this.yom = yom;
		this.noOfSeat = noOfSeat;
		this.carCategory = carCategory;
	}

	//Constructor 1
	public Car(long carId, int noOfSeat, String carCategory) {

		this.carId = carId;
		this.noOfSeat = noOfSeat;
		this.carCategory = carCategory;
	}

	//Constructor 2
	public Car(long carId, String model, int noOfSeat, String carCategory) {

		this.carId = carId;
		this.model = model;
		this.noOfSeat = noOfSeat;
		this.carCategory = carCategory;
	}
}
