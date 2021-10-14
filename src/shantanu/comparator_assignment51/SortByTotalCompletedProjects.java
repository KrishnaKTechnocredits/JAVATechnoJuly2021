package shantanu.comparator_assignment51;

import java.util.Comparator;

public class SortByTotalCompletedProjects implements Comparator<Builder> {

	@Override
	public int compare(Builder o1, Builder o2) {
		return o2.totalCompletedProjects - o1.totalCompletedProjects;
	}
	

}
