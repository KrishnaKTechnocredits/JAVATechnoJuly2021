package swati.Assignment50;

import java.util.*;

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
 */
public class Client {
	
		public static void main(String[] a) {
			Builder b1=new Builder("builder1","B2345",3,13);
			Builder b2=new Builder("builder2","A2345",5,12);
			Builder b3=new Builder("builder3","C2345",2,14);
			Builder b4=new Builder("builder2","A2345",10,10);
			Builder b5=new Builder("builder5","D2345",7,15);
			List<Builder> list1=new ArrayList<Builder>();
			list1.add(b1);
			list1.add(b2);
			list1.add(b3);
			list1.add(b4);
			list1.add(b5);
			Collections.sort(list1);
			System.out.println(list1);
		}

}
