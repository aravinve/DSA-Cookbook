package stack;

import java.util.Stack;

public class ValidateParenthesis {
	public static void main(String[] args) {
		String s1 = "()";
		String s2 = "()[]{}";
		String s3 = "([)]";
		System.out.println(validate(s1));
		System.out.println(validate(s2));
		System.out.println(validate(s3));
	}

	private static boolean validate(String s) {
		Stack<Character> stack = new Stack<>();
		for(char c: s.toCharArray()) {
			if(c == '{' || c == '[' || c == '(') {
				stack.push(c);
			} else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			}else if(c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			}else {
				return false;
			}
		}
		return stack.isEmpty();
	}
}
