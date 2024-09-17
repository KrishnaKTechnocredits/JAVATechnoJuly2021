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

Exception : while printing arrayList, it should print build names and revune based on revenue ascending order.*/

package astha.Assignment50;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		Builder builder1 = new Builder("Astha", "ABCDE10101", 25, 200);
		Builder builder2 = new Builder("Ankita", "DEFGH20202", 50, 89);
		Builder builder3 = new Builder("Akritee", "JKLMN50505", 20, 106);
		Builder builder4 = new Builder("Anamika", "GHIJK30303", 5, 157);
		Builder builder5 = new Builder("Aditi", "MNOPQ40404", 15, 425);

		List<Builder> list = new ArrayList<Builder>();
		list.add(builder1);
		list.add(builder2);
		list.add(builder3);
		list.add(builder4);
		list.add(builder5);
		Collections.sort(list);
		System.out.println(list);

	}

}
