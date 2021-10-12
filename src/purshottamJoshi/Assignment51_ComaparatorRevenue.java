package purshottamJoshi;

import java.util.Comparator;

public class Assignment51_ComaparatorRevenue implements Comparator<Assignment51_Builder> {

	@Override
	public int compare(Assignment51_Builder o1, Assignment51_Builder o2) {
		// TODO Auto-generated method stub
		return o1.revenue - o2.revenue;
	}

}
