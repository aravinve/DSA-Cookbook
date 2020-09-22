package queue;

public class Queue {

	int arr[];
	int top;
	int begin;
	
	public Queue(int size) {
		arr = new int[size];
		top = -1;
		begin = -1;
	}
	
	public boolean isFull() {
		return top == arr.length-1;
	}
	
	public boolean isEmpty() {
		return begin == -1 || begin == arr.length;
	}
	
	public void add(int value) {
		if(isEmpty()) {
			top++;
			arr[top] = value;
			begin = 0;
		}else if(isFull()) {
			System.out.println("Queue is Full");
		}else {
			top++;
			arr[top] = value;
		}
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Empty Queue");
		} else {
			System.out.println(arr[begin]);
		}
	}
	
	public void poll() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}else {
			System.out.println("Removing element from queue: " + arr[begin]);
			begin++;
			if(begin > top) {
				begin = -1;
				top = -1;
			}
		}
	}
}
