package stack;

public class Stack {
	int arr[];
	int top;
	
	public Stack(int size) {
		arr = new int[size];
		top = -1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == arr.length-1;
	}
	
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack Overflow!");
		}else {
			arr[top+1] = value;
			top++;
		}
	}
	
	public int peek() {
		if(!isEmpty()) {
			return arr[top];
		}
		else {
			System.out.println("Stack is Empty");
			return 0;
		}
			
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow!");
		} else {
			System.out.println("Popped: " + arr[top]);
			top--;
		}
	}
	
	public void delete() {
		arr = null;
	}
}
