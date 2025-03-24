package Collection_Framework.Collection_Framework_Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Array_Dequeue {

	public static void main(String[] args) {
		// Create a Deque using ArrayDeque
		Deque<Integer> deque = new ArrayDeque<>();

		// ---------------- QUEUE OPERATIONS (FIFO) ----------------
		deque.offerLast(10); // Enqueue at rear
		deque.offerLast(20);
		deque.offerLast(30);
		System.out.println("Deque after queue operations (FIFO): " + deque);

		System.out.println("Polling from front (FIFO): " + deque.pollFirst()); // Dequeue from front
		System.out.println("Deque after pollFirst: " + deque);

		// ---------------- STACK OPERATIONS (LIFO) ----------------
		deque.push(40); // Push (Stack behavior)
		deque.push(50);
		System.out.println("Deque after stack push operations (LIFO): " + deque);

		System.out.println("Popped element (LIFO): " + deque.pop()); // Pop (LIFO)
		System.out.println("Deque after pop: " + deque);

		// ---------------- ITERATORS ----------------
		// Forward iteration
		System.out.print("Iterating Forward: ");
		for (Integer num : deque) {
			System.out.print(num + " ");
		}
		System.out.println();

		// Backward iteration using descendingIterator()
		System.out.print("Iterating Backward: ");
		Iterator<Integer> it = deque.descendingIterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

		System.out.print("Interator Forward: ");
		Iterator<Integer> iit = deque.iterator();
		while (iit.hasNext()) {
			System.out.print(iit.next() + " ");
		}
		System.out.println();
	}

}
