package ca.uwaterloo.cs446.smells;

public class ThresholdCounter {
	private int thresh = 0;

	public ThresholdCounter(int thresh) {
		this.thresh = thresh;
	}

	public int underThreshold(int list[]) {
		int underCount = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] <= thresh) {
				underCount++;
			}
		}
		return underCount;
	}

	public int overThreshold(int list[]) {
		int overCount = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] > thresh) {
				overCount++;
			}
		}
		return overCount;
	}			
}
