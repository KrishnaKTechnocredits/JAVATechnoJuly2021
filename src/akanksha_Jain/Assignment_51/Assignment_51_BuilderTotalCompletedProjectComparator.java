package akanksha_Jain.Assignment_51;

import java.util.Comparator;

public class Assignment_51_BuilderTotalCompletedProjectComparator implements Comparator<Assignment_51_Builder> {

	@Override
	public int compare(Assignment_51_Builder builder1, Assignment_51_Builder builder2) {
		return builder2.totalCompletedProject - builder1.totalCompletedProject;
	}
}
