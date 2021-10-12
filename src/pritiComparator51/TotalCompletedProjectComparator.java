package pritiComparator51;

import java.util.Comparator;

public class TotalCompletedProjectComparator implements Comparator<Builder> {
	@Override
	public int compare(Builder b1, Builder b2) {
		//return b1.totalCompletedproject- b2.totalCompletedproject;
		return b2.totalCompletedproject-b1.totalCompletedproject;
		
	}

}
