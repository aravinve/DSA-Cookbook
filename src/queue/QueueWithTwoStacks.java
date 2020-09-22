package queue;

import java.util.Stack;

public class QueueWithTwoStacks {
	
	Stack<Integer> stackNewest;
	Stack<Integer> stackOldest;
	
	public QueueWithTwoStacks() {
		stackNewest = new Stack<>();
		stackOldest = new Stack<>();
	}
	
	public void add(int value) {
		stackNewest.push(value);
	}
	
	public void shiftData() {
		if(stackOldest.isEmpty()) {
			while(!stackNewest.isEmpty()) {
				stackOldest.push(stackNewest.pop());
			}
		}
	}
	
	public Integer peek() {
		shiftData();
		return stackOldest.peek();
	}
	
	public Integer poll() {
		shiftData();
		return stackOldest.pop();
	}
	
	public static void main(String[] args) {
		QueueWithTwoStacks q = new QueueWithTwoStacks();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.poll());
	}
}
