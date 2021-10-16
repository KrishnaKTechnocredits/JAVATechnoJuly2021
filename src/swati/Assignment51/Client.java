package swati.Assignment51;

import java.util.*;

/*
 * Assignment - 51 : 10th Oct'2021 [Comparator]
Write a method to sort builder object based on revenue (acending) and totalCompletedProject;

Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.

Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> Create a list, add all builder objects and sort it.
-> override toString method to print builder name, revenue.

Exception : while sort the arrayList based on revene, it should print build information based on revenue ascending order. while sort the arrayList based on totalCompletedProject, it should print build information based decending order of totalCompletedProject.
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
		Collections.sort(list1,new SortOnRevenue());
		System.out.println(list1);
		Collections.sort(list1,new SortOnTotalProject().reversed());
		System.out.println(list1);
		
		
	}

}
