package Collection_Framework.Collection_Framework_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Array_List_CF {
    public static void main(String[] args) {
        
        // 1️⃣ Creating an ArrayList
        ArrayList<String> names = new ArrayList<>();

        // 2️⃣ Adding Elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        System.out.println("Initial ArrayList: " + names);

        // 3️⃣ Adding at a specific index
        names.add(2, "Eve");
        System.out.println("After adding at index 2: " + names);

        // 4️⃣ Checking size
        System.out.println("Size of ArrayList: " + names.size());

        // 5️⃣ Checking if an element exists
        System.out.println("Contains 'Bob'? " + names.contains("Bob"));

        
        // 6️⃣ Accessing Elements
        System.out.println("Element at index 3: " + names.get(3));

        // 7️⃣ Updating an element
        names.set(1, "Robert");
        System.out.println("After updating index 1: " + names);

        // 8️⃣ Removing Elements
        names.remove("Charlie");  // Remove by value
        System.out.println("After removing 'Charlie': " + names);

        names.remove(2);  // Remove by index
        System.out.println("After removing element at index 2: " + names);

        // 9️⃣ Finding Index of Elements
        System.out.println("Index of 'Alice': " + names.indexOf("Alice"));

        // 🔟 Checking if ArrayList is empty
        System.out.println("Is ArrayList empty? " + names.isEmpty());

        // 1️⃣1️⃣ Iterating using For-Each Loop
        System.out.println("\n🔄 Iterating using for-each loop:");
        for (String name : names) {
            System.out.println(name);
        }

        // 1️⃣2️⃣ Iterating using Iterator
        System.out.println("\n🔄 Iterating using Iterator:");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 1️⃣3️⃣ Iterating using ListIterator (Both Forward and Backward)
        System.out.println("\n🔄 Iterating using ListIterator (Forward & Backward):");
        ListIterator<String> listIterator = names.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("Forward: " + listIterator.next());
        }
        while (listIterator.hasPrevious()) {
            System.out.println("Backward: " + listIterator.previous());
        }

        // 1️⃣4️⃣ Iterating using forEach() Method (Lambda)
        System.out.println("\n🔄 Iterating using forEach() method:");
        names.forEach(name -> System.out.println(name));

        // 1️⃣5️⃣ Iterating using Stream API (Java 8+)
        System.out.println("\n🔄 Iterating using Stream API:");
        names.stream().forEach(System.out::println);

        // 1️⃣6️⃣ Filtering elements using Stream API
        System.out.println("\n🔍 Names that start with 'A':");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // 1️⃣7️⃣ Clearing the ArrayList
        names.clear();
        System.out.println("\nArrayList after clearing: " + names);
    }
}
