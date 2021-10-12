package monali.Assignment_49;

import java.util.HashSet;
/*Assignment - 49 : 10th Oct [hashCode & Equals]
Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.

Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> all parameters are same for 2 objects
-> Create a set and return only unique builder information.
 -> uniqueness should be based on name, gstNumber, Revenue.
-> Expected answer is - 4*/

public class Client {
	public static void main(String[] args) {
		Builder b1=new Builder("Clover",20044,8,12000);
		Builder b2=new Builder("Kumar",20099,6,5000);
		Builder b3=new Builder("Bhakti",11900,10,9000);
		Builder b4=new Builder("Rohan",40044,12,15000);
		Builder b5=new Builder("Clover",20044,8,12000);
		
		HashSet<Builder> set=new HashSet<>();
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		System.out.println("Unique Builders : "+set.size());
	}
	
	
	}
	
