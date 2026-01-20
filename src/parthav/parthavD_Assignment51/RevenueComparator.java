package parthav.parthavD_Assignment51;

import java.util.Comparator;

public class RevenueComparator implements Comparator<Builder> {
	
	@Override
	public int compare(Builder obj1, Builder obj2) {
		return (obj1.revenue - obj2.revenue);
		
	}

}
