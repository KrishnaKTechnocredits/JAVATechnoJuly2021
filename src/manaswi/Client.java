/*Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> all parameters are same for 2 objects
-> Create a set and return only unique builder information.
 -> uniqueness should be based on name, gstNumber, Revenue.
-> Expected answer is - 4.*/

package manaswi;
import java.util.HashSet;
import java.util.Set;

public class Client 
{

	public static void main(String[] args) 
	{

		Builder builder1=new Builder("Eliza",5678,8,50000);
		Builder builder2=new Builder("Eliza",5678,8,50000);
		Builder builder3=new Builder("Mary",5680,9,70000);
		Builder builder4=new Builder("Lizzie",5681,7,80000);
		Builder builder5=new Builder("Marc",5682,5,90000);

		Set<Builder> set= new HashSet<Builder>();
		set.add(builder1);
		set.add(builder2);
		set.add(builder3);
		set.add(builder4);
		set.add(builder5);

		System.out.println(set.size());
	}

}