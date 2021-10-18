package parthav.parthavD_Assignment51;

import java.util.Comparator;

public class CompletedProjectComparator implements Comparator<Builder> {
	
	public int compare(Builder obj1, Builder obj2) {
		return (obj1.totalCompletedProject - obj2.totalCompletedProject); 
	}

}
