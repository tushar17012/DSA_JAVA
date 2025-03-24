package CF_Map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a HashMap
		Map<Integer, String> map = new HashMap<>();

		// Adding key-value pairs
		map.put(101, "Alice");
		map.put(102, "Bob");
		map.put(103, "Charlie");
		map.put(104, "David");

		// Printing the map
		System.out.println("Initial Map: " + map);

		// Getting a value by key
		System.out.println("Value for key 102: " + map.get(102));

		// Checking if a key exists
		System.out.println("Contains key 105? " + map.containsKey(105));

		// Checking if a value exists
		System.out.println("Contains value 'Charlie'? " + map.containsValue("Charlie"));

		// Removing a key-value pair
		map.remove(103);
		System.out.println("After removing key 103: " + map);

		// Iterating over keys
		System.out.println("Keys:");
		for (Integer key : map.keySet()) {
			System.out.println(key);
		}

		// Iterating over values
		System.out.println("Values:");
		for (String value : map.values()) {
			System.out.println(value);
		}

		// Iterating over key-value pairs
		System.out.println("Entries:");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

}
