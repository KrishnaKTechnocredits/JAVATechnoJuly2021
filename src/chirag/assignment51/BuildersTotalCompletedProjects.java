package chirag.assignment51;

import java.util.Comparator;

public class BuildersTotalCompletedProjects implements Comparator<Builder> {

	@Override
	public int compare(Builder b1, Builder b2) {
		
		return b1.totalCompleteProject -b2.totalCompleteProject;
	}
}
