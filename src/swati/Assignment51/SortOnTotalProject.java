package swati.Assignment51;

import java.util.Comparator;

public class SortOnTotalProject implements Comparator<Builder> {

	@Override
	public int compare(Builder o1, Builder o2) {

		return o1.totalCompletedProject-o2.totalCompletedProject;
	}

}