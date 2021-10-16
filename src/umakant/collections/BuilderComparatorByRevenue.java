package umakant.collections;

import java.util.Comparator;

public class BuilderComparatorByRevenue implements Comparator<BuilderComparator> {

	@Override
	public int compare(BuilderComparator o1, BuilderComparator o2) {
		// TODO Auto-generated method stub
		return o1.revenue - o2.revenue;
	}

}
