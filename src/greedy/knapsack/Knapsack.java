package greedy.knapsack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Knapsack {
	public static void main(String[] args) {
		List<KnapsackItem> itemsList = new ArrayList<>();
		int[] value = { 6, 2, 1, 8, 3, 5 };
		int[] weight = { 6, 10, 3, 5, 1, 3 };
		int capacity = 21;
		for (int i = 0; i < value.length; i++) {
			itemsList.add(new KnapsackItem(i + 1, value[i], weight[i]));
		}
		knapsackGreedy(itemsList, capacity);
	}

	private static void knapsackGreedy(List<KnapsackItem> itemsList, int capacity) {
		Collections.sort(itemsList, new Comparator<KnapsackItem>() {

			@Override
			public int compare(KnapsackItem arg0, KnapsackItem arg1) {
				if (arg1.getItemRatio() > arg0.getItemRatio()) {
					return 1;
				} else {
					return -1;
				}
			}

		});

		int usedCapacity = 0;
		double value = 0;
		for (KnapsackItem item : itemsList) {
			int currentCapacity = item.getItemWeight();
			int currentValue = item.getItemValue();
			if (usedCapacity + currentCapacity <= capacity) {
				usedCapacity += currentCapacity;
				value += currentValue;
				System.out.println("Item: " + item.getItemIndex()+ " @ value " + item.getItemValue());
			} else {
				int balanceCapacity = capacity - usedCapacity;
				double possibleValue = balanceCapacity * item.getItemRatio();
				usedCapacity += balanceCapacity;
				value += possibleValue;
				System.out.println(
						"Item: " + item.getItemIndex() + " @ value " + possibleValue);
			}
			if (usedCapacity == capacity) {
				break;
			}
		}
		System.out.println("Total Value: " + value);
	}
}
