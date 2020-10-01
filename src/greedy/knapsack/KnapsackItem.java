package greedy.knapsack;

public class KnapsackItem {

	private int itemIndex;
	private int itemValue;
	private int itemWeight;
	private double itemRatio;
	
	public KnapsackItem(int itemIndex, int itemValue, int itemWeight) {
		this.itemIndex = itemIndex;
		this.itemValue = itemValue;
		this.itemWeight = itemWeight;
		this.itemRatio = itemValue * 1.0 / itemWeight;
	}

	public int getItemIndex() {
		return itemIndex;
	}

	public void setItemIndex(int itemIndex) {
		this.itemIndex = itemIndex;
	}

	public int getItemValue() {
		return itemValue;
	}

	public void setItemValue(int itemValue) {
		this.itemValue = itemValue;
	}

	public int getItemWeight() {
		return itemWeight;
	}

	public void setItemWeight(int itemWeight) {
		this.itemWeight = itemWeight;
	}

	public double getItemRatio() {
		return itemRatio;
	}

	public void setItemRatio(double itemRatio) {
		this.itemRatio = itemRatio;
	}
	
	
}
