package devendra_3;
import java.util.HashSet;
import java.util.Set;

public class Client {
	public static void main(String[] args) {
		CallBuilder obj1 = new CallBuilder("Mahesh", "WJT1986211OCT", 4, 10000);
		CallBuilder obj2 = new CallBuilder("Techno", "CJI90224355AT", 4, 12000);
		CallBuilder obj3 = new CallBuilder("Credits", "MJH9278583GT", 3, 250000);
		CallBuilder obj4 = new CallBuilder("Techno", "CJI90224355AT", 4, 12000);
		CallBuilder obj5 = new CallBuilder("Babu", "RJI55332211QT", 6, 500000);

		Set<CallBuilder> set = new HashSet<>();
		set.add(obj1);
		set.add(obj2);
		set.add(obj3);
		set.add(obj4);
		set.add(obj5);

		System.out.println("Unique Builders are "+set.size());
	}
}
/*
Assignment - 49 : 10th Oct [hashCode & Equals]

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