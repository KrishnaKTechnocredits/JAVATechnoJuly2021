package shalaka.Assignment51;

import java.util.Comparator;

public class BuilderRevenueComparator implements Comparator<Ass51_Builder> {
	@Override
	public int compare(Ass51_Builder o1, Ass51_Builder o2) {
		return o1.revenue - o2.revenue;
	}
}
