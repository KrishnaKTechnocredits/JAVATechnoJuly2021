package neha.assignment_51;

import java.util.Comparator;

public class RevenueComparator implements Comparator<Builder> {

	@Override
	public int compare(Builder o1, Builder o2) {
		return o1.revenue - o2.revenue;
	}
}
