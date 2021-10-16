package indu.Assignment_51;

import java.util.Comparator;

public class RevenueComparator_51 implements Comparator<Builder_51> {

	@Override
	public int compare(Builder_51 o1, Builder_51 o2) {
		
		return o1.revenue-o2.revenue;
	}

}
