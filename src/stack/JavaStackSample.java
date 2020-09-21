package stack;

import java.util.Stack;

public class JavaStackSample {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		if(stack.isEmpty()) {
			System.out.println("Stack is Empty");
		}
		
		System.out.println("Refilling Now ....");
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println(stack.peek());
		
		System.out.println(stack.contains(3));
		System.out.println(stack.contains(34));

	}
}
