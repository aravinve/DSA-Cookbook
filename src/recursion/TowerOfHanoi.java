package recursion;

import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N: ");
		int n = s.nextInt();
		hanoi(n);
		s.close();
	}

	private static void hanoi(int n) {
		shiftRods(n, 'A', 'C', 'B');
	}

	private static void shiftRods(int n, char fromRod, char toRod, char auxRod) {
		if(n == 1) {
			System.out.println("Move disk" + n + " from " + fromRod + " to " + toRod);
			return;
		}
		shiftRods(n - 1, fromRod, auxRod, toRod);
		System.out.println("Move disk" + n + " from " + fromRod + " to " + toRod);
		shiftRods(n - 1, auxRod, toRod, fromRod);
	}
}
