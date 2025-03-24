package OOPs_Abstraction;

//Abstract class
abstract class Vehicle {
	// Field
	private String type;

	// Constructor
	public Vehicle(String type) {
		this.type = type;
	}

	// Abstract method (must be implemented by subclasses)
	public abstract void start();

	// Concrete method
	public void stop() {
		System.out.println(type + " is stopping.");
	}

	// Static method
	public static void honk() {
		System.out.println("Honk! Honk!");
	}

	// Final method
	public final void description() {
		System.out.println("This is a " + type + ".");
	}
}

//Subclass of Vehicle
class Car extends Vehicle {
	// Constructor
	public Car(String type) {
		super(type); // Call the superclass constructor
	}

	// Implementation of the abstract method
	@Override
	public void start() {
		System.out.println("Car is starting.");
	}
}

//Subclass of Vehicle
class Bike extends Vehicle {
	// Constructor
	public Bike(String type) {
		super(type); // Call the superclass constructor
	}

	// Implementation of the abstract method
	@Override
	public void start() {
		System.out.println("Bike is starting.");
	}
}

public class Abstraction_Method {

	public static void main(String[] args) {
		// Create objects of subclasses
		Car car = new Car("Car");
		Bike bike = new Bike("Bike");

		// Call methods
		car.start(); // Output: Car is starting.
		car.stop(); // Output: Car is stopping.
		car.description(); // Output: This is a Car.

		bike.start(); // Output: Bike is starting.
		bike.stop(); // Output: Bike is stopping.
		bike.description(); // Output: This is a Bike.

		// Call static method
		Vehicle.honk(); // Output: Honk! Honk!
	}

}
