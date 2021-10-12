/*Assignment - 51 : 10th Oct'2021 [Comparator]
Write a method to sort builder object based on revenue (ascending) and totalCompletedProject;
Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.
Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> Create a list, add all builder objects and sort it.
-> override toString method to print builder name, revenue.
Exception : while sort the arrayList based on revenue, 
it should print build information based on revenue ascending order. 
while sort the arrayList based on totalCompletedProject,
 it should print build information based descending order of totalCompletedProject.
*/
package purshottamJoshi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment51 {
	
	
	public static void main(String[] args) {
		Assignment51_Builder builder1 = new Assignment51_Builder("DSK7", "JHKLM34587K", 70, 900000);
		Assignment51_Builder builder2 = new Assignment51_Builder("DREAMS", "PGHBN1978F", 10, 700000);
		Assignment51_Builder builder3 = new Assignment51_Builder("JW", "GHZPJ7769P", 30, 350000);
		Assignment51_Builder builder4 = new Assignment51_Builder("KUMAR", "DDUP7769Q", 45, 550000);
		Assignment51_Builder builder5 = new Assignment51_Builder("DSK", "JHKLM34587K", 70, 900000);
		List al=  new ArrayList<>();
		al.add(builder1);
		al.add(builder2);
		al.add(builder3);
		al.add(builder4);
		al.add(builder5);
		Collections.sort(al, new Assignment51_ComparatorTotalCompletedProject());
		System.out.println(al);
		Collections.sort(al, new Assignment51_ComaparatorRevenue());
		System.out.println(al);
	}

}
