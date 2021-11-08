package tarangAssignment51;

import java.util.Comparator;

public class Test implements Comparator<Builder> {

	@Override
	public int compare(Builder b1,Builder b2) {
		return b1.totalCompletedProject-b2.totalCompletedProject;
	}
	
}
