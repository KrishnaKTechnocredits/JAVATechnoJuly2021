package gauravk.Assignment_50;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Assignment - 50 : 10th Oct'2021 [Comparable]
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
---------------------------------------------------------------------------
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
		Collections.sort(builder);
		//System.out.println(builder.toString());
		for(Builder x : builder) {
			System.out.println(x);
		}
	}
}
