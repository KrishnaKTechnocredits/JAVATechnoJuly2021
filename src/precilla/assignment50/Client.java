package precilla.assignment50;

import java.util.ArrayList;
import java.util.Collections;
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
public class Client {
	public static void main(String[] args) {
		Builder b1=new Builder("Precilla",5678,3,38500);
		Builder b2=new Builder("Aranha",5678,2,4580);
		Builder b3=new Builder("Prathima",5478,5,2000);
		Builder b4=new Builder("Rozita",9632,6,9870);
		Builder b5=new Builder("Cilestine",4781,4,3450);

		ArrayList<Builder>al=new ArrayList<Builder>();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		al.add(b5);
		
		Collections.sort(al);
		System.out.println(al);
			
		
	}

}
