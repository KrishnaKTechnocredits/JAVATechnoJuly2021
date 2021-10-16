package purshottamJoshi;

import java.util.Comparator;

public class Assignment51_ComparatorTotalCompletedProject implements Comparator<Assignment51_Builder> {

	public int compare(Assignment51_Builder o1, Assignment51_Builder o2)  {
		
		return o2.totalCompletedProject - o1.totalCompletedProject;
	}

}
