package Collection_Framework.Collection_Framework_Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CF_LinkedHashSet {

	public static void main(String[] args) {
		// Create a LinkedHashSet
		LinkedHashSet<String> set = new LinkedHashSet<>();

		// Add elements
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		System.out.println("Initial Set: " + set);

		// Check if an element exists
		boolean containsApple = set.contains("Apple");
		System.out.println("Contains 'Apple': " + containsApple);

		// Remove an element
		set.remove("Banana");
		System.out.println("After removing 'Banana': " + set);

		// Get the size of the set
		int size = set.size();
		System.out.println("Size of the set: " + size);

		// Check if the set is empty
		boolean isEmpty = set.isEmpty();
		System.out.println("Is the set empty? " + isEmpty);

		// Iterate over elements
		System.out.println("Iterating over the set:");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Convert to an array
		String[] array = set.toArray(new String[0]);
		System.out.println("Array from set:");
		for (String fruit : array) {
			System.out.println(fruit);
		}

		// Clone the set
		LinkedHashSet<String> clonedSet = (LinkedHashSet<String>) set.clone();
		System.out.println("Cloned Set: " + clonedSet);

		// Clear the set
		set.clear();
		System.out.println("Set after clearing: " + set);
	}

}
