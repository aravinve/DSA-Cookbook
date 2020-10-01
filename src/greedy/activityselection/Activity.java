package greedy.activityselection;

public class Activity {

	private String name;
	private int startTime;
	private int endTime;
	
	public Activity(String name, int start, int end) {
		this.name = name;
		this.startTime = start;
		this.endTime = end;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	
	
}
