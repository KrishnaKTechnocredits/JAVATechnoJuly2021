package shalaka.Assignment51;

import java.util.Comparator;

public class BuilderTotalCompletedProjectComparator implements Comparator<Ass51_Builder> {

	@Override
	public int compare(Ass51_Builder o1, Ass51_Builder o2) {
		return o2.totalCompletedProject - o1.totalCompletedProject;
	}
}
