package madhavi;

import java.util.Comparator;

public class ComparatorByRevenue implements Comparator<BuilderComparator> {
	
	@Override
	public int compare(BuilderComparator object1, BuilderComparator object2) {
		// TODO Auto-generated method stub
		return object1.revenue - object2.revenue;
	}

}

