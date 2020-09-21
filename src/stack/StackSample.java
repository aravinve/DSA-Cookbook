package stack;

public class StackSample {
	public static void main(String[] args) {
		Stack stack = new Stack(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		while(!stack.isEmpty()) {
			stack.pop();
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
	}
}
