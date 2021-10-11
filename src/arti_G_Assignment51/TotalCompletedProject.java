package arti_G_Assignment51;

import java.util.Comparator;

public class TotalCompletedProject implements Comparator<Builder> {

	@Override
	public int compare(Builder arg0, Builder arg1) {
		
		return arg1.totalCompletedProject - arg0.totalCompletedProject ;
	}

}
