package Collection_Framework.Collection_Framework_Queue;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_CF {

	public static void main(String[] args) {
		 // Creating a Queue (LinkedList-based)
        Queue<String> queue = new LinkedList<>();

        // 1️⃣ Push elements (Same as offer() in Queue)
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");
        queue.offer("Date");
        System.out.println("Queue after adding elements: " + queue);

        // 2️⃣ Peek element (Top of Stack / Front of Queue)
        System.out.println("Peek (Front of Queue): " + queue.peek());

        // 3️⃣ Pop element (Remove element - Same as poll())
        System.out.println("Popped element: " + queue.poll());
        System.out.println("Queue after pop: " + queue);

        // 4️⃣ Size of the Queue
        System.out.println("Queue Size: " + queue.size());

        // 5️⃣ Check if Queue is empty
        System.out.println("Is Queue empty? " + queue.isEmpty());

        // 6️⃣ Contains (Check if element exists)
        System.out.println("Contains 'Banana'? " + queue.contains("Banana"));

        // 7️⃣ Iterating using For-Each Loop
        System.out.println("\n🔄 Iterating using for-each loop:");
        for (String item : queue) {
            System.out.println(item);
        }

        // 8️⃣ Iterating using Iterator
        System.out.println("\n🔄 Iterating using Iterator:");
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 9️⃣ Iterating using forEach() Method (Lambda)
        System.out.println("\n🔄 Iterating using forEach() method:");
        queue.forEach(item -> System.out.println(item));

        // 🔟 Iterating using Stream API
        System.out.println("\n🔄 Iterating using Stream API:");
        queue.stream().forEach(System.out::println);

        // 1️⃣1️⃣ Clear the Queue
        queue.clear();
        System.out.println("\nQueue after clearing: " + queue);
		
	}

}
