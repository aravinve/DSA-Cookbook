package queue;

public class QueueSample {
	public static void main(String[] args) {
		Queue q = new Queue(10);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		while (!q.isEmpty()) {
			q.poll();
		}
		if (q.isEmpty()) {
			System.out.println("Queue is Empty!");
		}
		System.out.println("Refill Now");
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.peek();
	}
}
