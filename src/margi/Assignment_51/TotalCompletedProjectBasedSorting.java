package margi.Assignment_51;

import java.util.Comparator;

public class TotalCompletedProjectBasedSorting implements Comparator<Builder>{

	@Override
	public int compare(Builder b1, Builder b2) {
		return b2.totalCompletedProject - b1.totalCompletedProject;
	}
}
