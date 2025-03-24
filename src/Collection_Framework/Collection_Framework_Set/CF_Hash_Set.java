package Collection_Framework.Collection_Framework_Set;

import java.util.HashSet;
import java.util.Set;

public class CF_Hash_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();

		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		set.add("Apple"); // Duplicate, will be ignored

		System.out.println("HashSet: " + set); // Output order may vary

		// Checking if an element exists
		System.out.println("Contains Banana? " + set.contains("Banana"));

		// Iterating over Set
		for (String fruit : set) {
			System.out.println(fruit);
		}

		// Removing an element
		set.remove("Cherry");
		System.out.println("After removing Cherry: " + set);
	}

}
