package Collection_Framework.Collection_Framework_List;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.stream.Collectors;

public class Stack_CF {

	public static void main(String[] args) {
		// 1️⃣ Creating a Stack
		Stack<String> stack = new Stack<>();

		// 2️⃣ Pushing elements onto the Stack
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");
		stack.push("Date");
		stack.push("Elderberry");

		System.out.println("Initial Stack: " + stack);

		// 3️⃣ Peek at the top element
		System.out.println("Top Element (peek): " + stack.peek());

		// 4️⃣ Popping elements from the Stack
		System.out.println("Popped Element: " + stack.pop());
		System.out.println("Stack after pop: " + stack);

		// 5️⃣ Checking if Stack is empty
		System.out.println("Is stack empty? " + stack.isEmpty());

		// 6️⃣ Searching for an element
		System.out.println("Position of 'Banana' from top: " + stack.search("Banana"));

		// 7️⃣ Checking Stack Size
		System.out.println("Current Stack Size: " + stack.size());

		// 8️⃣ Iterating using a For-Each Loop
		System.out.println("\n🔄 Iterating using For-Each Loop:");
		for (String item : stack) {
			System.out.println(item);
		}

		// 9️⃣ Iterating using an Iterator
		System.out.println("\n🔄 Iterating using Iterator:");
		Iterator<String> iterator = stack.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// 🔟 Iterating using ListIterator (Forward & Backward)
		System.out.println("\n🔄 Iterating using ListIterator (Forward & Backward):");
		ListIterator<String> listIterator = stack.listIterator();
		while (listIterator.hasNext()) {
			System.out.println("Forward: " + listIterator.next());
		}
		while (listIterator.hasPrevious()) {
			System.out.println("Backward: " + listIterator.previous());
		}

		// 1️⃣1️⃣ Iterating using forEach() Lambda Expression
		System.out.println("\n🔄 Iterating using forEach() Method:");
		stack.forEach(item -> System.out.println(item));

		// 1️⃣2️⃣ Iterating using Stream API
		System.out.println("\n🔄 Iterating using Stream API:");
		stack.stream().forEach(System.out::println);

		// 1️⃣3️⃣ Filtering Elements using Stream API
		System.out.println("\n🔍 Filtering Elements that start with 'B':");
		stack.stream().filter(item -> item.startsWith("B")).collect(Collectors.toList()).forEach(System.out::println);

		// 1️⃣4️⃣ Clearing the Stack
		stack.clear();
		System.out.println("\nStack after clearing: " + stack);

	}

}
