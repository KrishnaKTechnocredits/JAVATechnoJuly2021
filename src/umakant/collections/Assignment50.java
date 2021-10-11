/*
 Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.

Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> Create a list, add all builder objects and sort it.
-> override toString method to print builder name, revenue.

Exception : while printing arrayList, it should print build names and revune based on revenue ascending order.
 */
package umakant.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment50 {
	
	public static void main(String[] args) {
		BuilderComparable builder1 = new BuilderComparable("Umakant", "gstNumber", 100, 1500);
		BuilderComparable builder2 = new BuilderComparable("Aniraj", "gstNumber", 100, 1600);
		BuilderComparable builder3 = new BuilderComparable("Ankush", "gstNumber3", 1001, 1400);
		BuilderComparable builder4 = new BuilderComparable("Kartik", "gstNumber", 1002, 1800);
		BuilderComparable builder5 = new BuilderComparable("Kunal", "gstNumber", 1003, 1700);
		ArrayList<BuilderComparable> builderList = new ArrayList<BuilderComparable>();
		builderList.add(builder1);
		builderList.add(builder2);
		builderList.add(builder3);
		builderList.add(builder4);
		builderList.add(builder5);
		Collections.sort(builderList);
		System.out.println(builderList);
		
	}
	
	
	
}
