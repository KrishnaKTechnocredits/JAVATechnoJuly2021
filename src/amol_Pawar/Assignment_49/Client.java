package amol_Pawar.Assignment_49;

import java.util.HashSet;

/*Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.

Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> all parameters are same for 2 objects
-> Create a set and return only unique builder information.
 -> uniqueness should be based on name, gstNumber, Revenue.
-> Expected answer is - 4.*/

public class Client {

	public static void main(String[] args) {
		Builder builder=new Builder("Amol", "GST123", 1,500);
		Builder builder1=new Builder("Amol", "GST123", 2,500);
		Builder builder2=new Builder("Amol", "GST124", 5,3000);
		Builder builder3=new Builder("Amol", "GST125", 3,2000);
		Builder builder4=new Builder("Amol", "GST126", 4,1000);
		HashSet set=new HashSet();
		set.add(builder);
		set.add(builder1);
		set.add(builder2);
		set.add(builder3);
		set.add(builder4);
		System.out.println(set.size());
		
	}

}
