package Collection_Framework.Collection_Framework_Set;

import java.util.Objects;

public class Custom_Set_Class {
	private String name;
	private int age;

	// Constructor
	public Custom_Set_Class(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// Override equals method
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true; // Same object
		if (o == null || getClass() != o.getClass())
			return false; // Different class or null
		Custom_Set_Class that = (Custom_Set_Class) o; // Cast to Custom_Set_Class
		return age == that.age && Objects.equals(name, that.name); // Compare fields
	}

	// Override hashCode method
	@Override
	public int hashCode() {
		return Objects.hash(name, age); // Generate hash code based on fields
	}

	// Override toString method for better readability
	@Override
	public String toString() {
		return "Custom_Set_Class{name='" + name + "', age=" + age + "}";
	}
}
