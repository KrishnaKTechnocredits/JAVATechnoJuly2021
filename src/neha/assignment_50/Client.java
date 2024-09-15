package neha.assignment_50;

import java.util.ArrayList;
import java.util.Collections;

/*Assignment - 50 : 10th Oct'2021 [Comparable]
Write a method to sort builder object based on revenue;

Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> Create a list, add all builder objects and sort it.
-> override toString method to print builder name, revenue.

Exception : while printing arrayList, it should print build names and revenue based on revenue ascending order.*/
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
		Collections.sort(builderList);
		System.out.println(builderList);
	}
}
