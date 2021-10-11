package arti_G_Assignment51;

import java.util.Comparator;

public class TotalCompletedProject implements Comparator<Builder> {

	@Override
	public int compare(Builder arg0, Builder arg1) {
		
		return arg0.totalCompletedProject - arg1.totalCompletedProject ;
	}

}
