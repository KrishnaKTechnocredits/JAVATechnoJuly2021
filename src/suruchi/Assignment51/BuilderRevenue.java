package suruchi.Assignment51;

import java.util.Comparator;

public class BuilderRevenue implements Comparator<Builder>{
	
	public int compare(Builder b1, Builder b2) {
		// TODO Auto-generated method stub
		return b1.revenue-b2.revenue;
	}
}
