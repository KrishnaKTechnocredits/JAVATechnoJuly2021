package suruchi.Assignment51;

import java.util.Comparator;

public class BuilderTotalProjects implements Comparator<Builder>{

	public int compare(Builder b1, Builder b2) {
		// TODO Auto-generated method stub
		return b2.totalCompletedProject-b1.totalCompletedProject;
	}
}
