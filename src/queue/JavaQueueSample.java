package queue;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueueSample {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
		if (q.isEmpty()) {
			System.out.println("Queue is Empty!");
		}
		System.out.println("Refill Now");
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q.peek());
		System.out.println(q.contains(2));
		System.out.println(q.contains(12));

	}
}
