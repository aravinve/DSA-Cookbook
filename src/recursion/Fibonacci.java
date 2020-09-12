package recursion;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N: ");
		int n = s.nextInt();
		System.out.println(fib(n));
		System.out.println(dbFib(n));
		s.close();
	}

	private static int dbFib(int n) {
		int[] dp = new int[n+2];
		dp[0] = 0;
		dp[1] = 1;
		for(int i=2;i<=n;i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	}

	private static int fib(int n) {
		if(n<=1) {
			return n;
		}else {
			return fib(n -1) + fib(n-2);
		}
	}
}
