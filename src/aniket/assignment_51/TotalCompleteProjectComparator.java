package aniket.assignment_51;

import java.util.Comparator;

public class TotalCompleteProjectComparator implements Comparator<Builder_51> {

	@Override
	public int compare(Builder_51 o1, Builder_51 o2) {
		return o1.totalCompleteProjects - o2.totalCompleteProjects;
	}

}
