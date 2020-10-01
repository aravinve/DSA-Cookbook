package greedy.activityselection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ActivityMain {
	public static void main(String[] args) {
		List<Activity> activityList = new ArrayList<>();
		activityList.add(new Activity("A1", 0, 6));
		activityList.add(new Activity("A2", 3, 4));
		activityList.add(new Activity("A3", 1, 2));
		activityList.add(new Activity("A4", 5, 8));
		activityList.add(new Activity("A5", 5, 7));
		activityList.add(new Activity("A6", 8, 9));
		selectActivity(activityList);
	}

	private static void selectActivity(List<Activity> activityList) {
		Collections.sort(activityList, new Comparator<Activity>() {
			@Override
			public int compare(Activity o1, Activity o2) {
				return o1.getEndTime() - o2.getEndTime();
			}
		});
		Activity previousActivity = activityList.get(0);
		System.out.println(previousActivity.getName());
		for(int i=1 ;i<activityList.size();i++) {
			if(activityList.get(i).getStartTime() >= previousActivity.getEndTime()) {
				System.out.println(activityList.get(i).getName());
				previousActivity = activityList.get(i);
			}
		}
	}
}
