/*Assignment - 50 : 10th Oct'2021 [Comparable]
Write a method to sort builder object based on revenue;

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
package amol_Pawar.assignment_50;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		Builder builder=new Builder("Amol", "GST12", 2, 1000);
		Builder builder1=new Builder("Sanket", "GST13", 2, 4000);
		Builder builder2=new Builder("Sushant", "GST14", 2, 500);
		Builder builder3=new Builder("Ankit", "GST15", 2, 9000);
		
		List list=new ArrayList();
		list.add(builder);
		list.add(builder1);
		list.add(builder2);
		list.add(builder3);
		Collections.sort(list);
		System.out.println(list);
	}

}
