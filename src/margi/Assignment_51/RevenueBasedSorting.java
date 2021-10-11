package margi.Assignment_51;

import java.util.Comparator;

public class RevenueBasedSorting implements Comparator<Builder>{

	@Override
	public int compare(Builder b1, Builder b2) {
		return b1.revenue - b2.revenue;
	}
}
