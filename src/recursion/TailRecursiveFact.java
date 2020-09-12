package recursion;

import java.util.Scanner;

public class TailRecursiveFact {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N: ");
		int n = s.nextInt();
		int result = fact(n);
		System.out.println(result);
		s.close();
	}

	private static int fact(int n) {
		return tailRecursiveFact(n, 1);
	}

	private static int tailRecursiveFact(int n, int a) {
		if (n == 0) {
			return a;
		}
		return tailRecursiveFact(n - 1, n * a);
	}
}
