package gauravk.Assignment_51;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Assignment - 51 : 10th Oct'2021 [Comparator]
Write a method to sort builder object based on revenue (acending) and totalCompletedProject;

Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.

Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> Create a list, add all builder objects and sort it.
-> override toString method to print builder name, revenue.

Exception : while sort the arrayList based on revene, it should print build information based on revenue ascending order. while sort the arrayList based on totalCompletedProject, it should print build information based decending order of totalCompletedProject.

----------------------------------------------------------------------
 */
public class Client {
	public static void main(String[] args) {
		Builder b1 = new Builder("Gaurav & CO", "KG1000KG", 75, 9300000);
		Builder b2 = new Builder("Mandip & CO", "MP5136IW", 64, 9210000);
		Builder b3 = new Builder("CLEARVIEW", "CW9028JSL", 44, 10000000);
		Builder b4 = new Builder("BUILDMASTER", "BR2093LS", 70, 8300000);
		Builder b5 = new Builder("SKYBUILDER LTD", "SK0029BR", 60, 14200000);
		
		ArrayList<Builder> builder = new ArrayList<Builder>();
		builder.add(b1);
		builder.add(b2);
		builder.add(b3);
		builder.add(b4);
		builder.add(b5);
		Collections.sort(builder, new BuilderSortedByRevenueAscending());
		System.out.println("Sorting done by Revenue in Ascending order");
		for(Builder x : builder) {
			System.out.println(x);
		}
		System.out.println("--------------------------");
		Collections.sort(builder, new BuilderSortedByProjectsDescending().reversed());
		System.out.println("Sorting done by Projects completed in Descending order");
		for(Builder x : builder) {
			System.out.println(x);
		}
	}
}
