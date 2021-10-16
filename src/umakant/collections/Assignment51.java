/*
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
 */
package umakant.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment51 {

	public static void main(String[] args) {
		BuilderComparator builder1 = new BuilderComparator("Umakant", "gstNumber", 1050, 1500);
		BuilderComparator builder2 = new BuilderComparator("Aniraj", "gstNumber", 950, 1800);
		BuilderComparator builder3 = new BuilderComparator("Kartik", "gstNumber3", 1001, 1400);
		ArrayList<BuilderComparator> builderList = new ArrayList<BuilderComparator>();
		builderList.add(builder1);
		builderList.add(builder2);
		builderList.add(builder3);
		Collections.sort(builderList, new BuilderComparatorByRevenue());
		System.out.println(builderList);
		Collections.sort(builderList, new BuilderComparatorByName());
		System.out.println(builderList);
	}

}
