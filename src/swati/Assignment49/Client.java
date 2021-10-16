package swati.Assignment49;

import java.util.*;

/*
 * Assignment - 49 : 10th Oct [hashCode & Equals]

Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.

Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> all parameters are same for 2 objects
-> Create a set and return only unique builder information.
 -> uniqueness should be based on name, gstNumber, Revenue.
-> Expected answer is - 4.
 */
public class Client {
	
	public static void main(String[] a) {
		Builder b1=new Builder("builder1","B2345",3,13);
		Builder b2=new Builder("builder2","A2345",5,12);
		Builder b3=new Builder("builder3","C2345",2,14);
		Builder b4=new Builder("builder2","A2345",10,12);
		Builder b5=new Builder("builder5","D2345",7,15);
		
		Set <Builder> set1=new HashSet<Builder>();
		set1.add(b1);
		set1.add(b2);
		set1.add(b3);
		set1.add(b4);
		set1.add(b5);
		System.out.println(set1.size());
		System.out.println(set1);
	}

}

