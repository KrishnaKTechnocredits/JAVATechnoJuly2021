package akanksha_Jain.Assignment_51;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment_51_Client {

	public static void main(String[] args) {
		ArrayList<Assignment_51_Builder> al = new ArrayList<Assignment_51_Builder>();
		Assignment_51_Builder b1 = new Assignment_51_Builder("Maulik", 1, 5, 10000);
		Assignment_51_Builder b2 = new Assignment_51_Builder("Bilal", 2, 2, 20000);
		Assignment_51_Builder b3 = new Assignment_51_Builder("Vivek", 3, 4, 95000);
		Assignment_51_Builder b4 = new Assignment_51_Builder("Akansha", 4, 3, 50000);
		Assignment_51_Builder b5 = new Assignment_51_Builder("Rasika", 5, 1, 90000);
		
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		al.add(b5);
		
		Collections.sort(al, new Assignment_51_BuilderRevenueComparator());
		System.out.println("Ascending sorting on the basis of revenue");
		System.out.println(al);
		
		Collections.sort(al, new Assignment_51_BuilderTotalCompletedProjectComparator());
		System.out.println();
		System.out.println("Descending sorting on the basis of total completed project");
		System.out.println(al);
	}

}
