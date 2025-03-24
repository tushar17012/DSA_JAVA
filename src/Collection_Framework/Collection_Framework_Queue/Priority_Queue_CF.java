package Collection_Framework.Collection_Framework_Queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority_Queue_CF {

	public static void main(String[] args) {
		// Creating a PriorityQueue with Reverse Order (Max-Heap behavior)
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

		// Mimicking Stack Operations

		// 1. Push elements
		push(priorityQueue, 10);
		push(priorityQueue, 20);
		push(priorityQueue, 5);
		push(priorityQueue, 30);

		System.out.println("PriorityQueue (as Stack): " + priorityQueue);

		// 2. Pop (Remove top element)
		System.out.println("Popped: " + pop(priorityQueue));

		// 3. Peek (Check top element)
		System.out.println("Top Element: " + peek(priorityQueue));

		// 4. Checking if empty
		System.out.println("Is Empty? " + isEmpty(priorityQueue));

		// 5. Using an Iterator to traverse the PriorityQueue
		System.out.print("Elements in Queue: ");
		Iterator<Integer> iterator = priorityQueue.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

	// Stack-like push method
	public static void push(PriorityQueue<Integer> pq, int value) {
		pq.add(value);
	}

	// Stack-like pop method (removes the highest priority element)
	public static int pop(PriorityQueue<Integer> pq) {
		return pq.poll(); // Retrieves and removes the top element
	}

	// Stack-like peek method (returns the highest priority element without removing
	// it)
	public static int peek(PriorityQueue<Integer> pq) {
		return pq.peek();
	}

	// Check if the queue is empty
	public static boolean isEmpty(PriorityQueue<Integer> pq) {
		return pq.isEmpty();
	}

}
