package greedy.coinchange;

import java.util.Arrays;

public class CoinChange {
	public static void main(String[] args) {
		int [] coins = {1, 2, 5, 10, 20, 50, 100, 500, 1000, 2000};
		int N = 548;
		coinChangeGreedy(coins, N);
	}

	private static void coinChangeGreedy(int[] coins, int N) {
		Arrays.sort(coins);
		int index = coins.length -1;
		while(true) {
			int currentCoin = coins[index];
			index--;
			int maxAmount = (N/currentCoin) * currentCoin;
			if(maxAmount > 0) {
				System.out.println("Coin: " + currentCoin + "---->   Count: "+ (N/currentCoin) );
				N = N - maxAmount;
			}
			if(N == 0) {
				break;
			}
		}
	}
}
