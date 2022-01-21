package neha.assignment_51;

import java.util.ArrayList;
import java.util.Collections;

/*Assignment - 51 : 10th Oct'2021 [Comparator]
Write a method to sort builder object based on revenue (ascending) and totalCompletedProject;

Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> Create a list, add all builder objects and sort it.
-> override toString method to print builder name, revenue.

Expected : while sort the arrayList based on revenue, 
it should print build information based on revenue ascending order. 
while sort the arrayList based on totalCompletedProject, 
it should print build information based descending order of totalCompletedProject.*/
public class Client {
	public static void main(String[] args) {
		Builder b1 = new Builder("Parth", 127, 6, 45000);
		Builder b2 = new Builder("Sara", 120, 11, 85000);
		Builder b3 = new Builder("Aarchi", 137, 8, 65000);
		Builder b4 = new Builder("Avani", 128, 12, 98000);
		Builder b5 = new Builder("Ovi", 129, 2, 15000);
		ArrayList<Builder> builderList = new ArrayList<Builder>();
		builderList.add(b1);
		builderList.add(b2);
		builderList.add(b3);
		builderList.add(b4);
		builderList.add(b5);
		Collections.sort(builderList, new RevenueComparator());
		System.out.println(builderList);
		Collections.sort(builderList, new TotalCompletedProjectComparator());
		System.out.println(builderList);
	}
}
