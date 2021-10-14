package shantanu.comparator_assignment51;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
	public static void main(String[] args) {
		Builder builder1 = new Builder("Gokhale Constructions",12345,50,25000);
		Builder builder2 = new Builder("Paranjpe Schemes",67890,65,45000);
		Builder builder3 = new Builder("Vyas Builders",54321,60,40000);
		Builder builder4 = new Builder("Kotibhaskar Constructions",98765,40,30000);
		Builder builder5 = new Builder("Lodha Group",13579,70,55000);
		
		ArrayList<Builder> listOfBuilders = new ArrayList();
		listOfBuilders.add(builder1);
		listOfBuilders.add(builder2);
		listOfBuilders.add(builder3);
		listOfBuilders.add(builder4);
		listOfBuilders.add(builder5);
		
		System.out.println("Before sorting:");
		System.out.println(listOfBuilders);
		
		System.out.println("After sorting by revenue in ascending order");
		Collections.sort(listOfBuilders, new SortByRevenue());
		System.out.println(listOfBuilders);
		
		System.out.println("After sorting by number of completed projects in descending order");
		Collections.sort(listOfBuilders, new SortByTotalCompletedProjects());
		System.out.println(listOfBuilders);
	}
}
