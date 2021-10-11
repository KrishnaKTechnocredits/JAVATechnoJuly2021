package umakant.collections;

import java.util.Comparator;

public class BuilderComparatorByName implements Comparator<BuilderComparator> {

	@Override
	public int compare(BuilderComparator o1, BuilderComparator o2) {
		// TODO Auto-generated method stub
		return o2.totalCompletedProject - o1.totalCompletedProject;
	}

}
