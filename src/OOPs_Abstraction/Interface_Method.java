package OOPs_Abstraction;

// Define an interface with default and static methods
interface Logger {
	void logger(); // Abstract method that must be implemented

	// Default method (provides a default implementation)
	default void log_error(String error_msg) {
		System.out.println("Error: " + error_msg);
	}

	// Static method (belongs to interface, not instances)
	static void print_log_level() {
		System.out.println("Level: Info");
	}
}

// Implementing the interface
public class Interface_Method implements Logger {

	// Implementing the abstract method from Logger interface
	@Override
	public void logger() {
		System.out.println("Logging information...");
	}

	// Custom method to log messages
	public void logger(String name) {
		System.out.println("Logs: " + name);
	}

	public static void main(String[] args) {
		Interface_Method obj = new Interface_Method();

		// Calling the overridden method
		obj.logger();

		// Calling the overloaded method with a string argument
		obj.logger("Tushar");

		// Calling default method from the interface
		obj.log_error("This is an error!");

		// Calling static method from interface
		Logger.print_log_level();
	}
}
