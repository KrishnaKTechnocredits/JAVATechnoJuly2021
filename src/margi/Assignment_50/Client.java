package margi.Assignment_50;

import java.util.ArrayList;
import java.util.Collections;

/*[Comparable]
Write a method to sort builder object based on revenue;
Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> Create a list, add all builder objects and sort it.
-> override toString method to print builder name, revenue.
Exception : while printing arrayList, it should print build names
and revune based on revenue ascending order.*/

public class Client {

	public static void main(String[] args) {
		Builder b1 = new Builder("Alaska", "SHVKD138CISJ1HK", 103, 104759);
		Builder b2 = new Builder("Techno", "VID1MAH4C6IDCI", 399, 117401);
		Builder b3 = new Builder("Credits", "LBND3ML9MVDNTM", 338, 359104);
		Builder b4 = new Builder("Alexa", "DHVVO24HVK9CN9", 184, 936194);
		Builder b5 = new Builder("Techno", "VID1MAH4C6IDCI", 399, 117401);
		
		ArrayList<Builder> list = new ArrayList<>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		Collections.sort(list);
		System.out.println("Sorted List: " + list);
	}
}
