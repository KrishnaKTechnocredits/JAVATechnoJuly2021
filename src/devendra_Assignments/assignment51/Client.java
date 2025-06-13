package devendra_Assignments.assignment51;
/*Assignment - 51
10th Oct'2021 [Comparator]
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
. 
*/
import java.util.ArrayList;
import java.util.Collections;

public class Client {
	public static void main(String[] args) {

		CallBuilder obj1=new CallBuilder("Shreyash", "GUJT848347857", 4, 100000);
		CallBuilder obj2=new CallBuilder("Shashank", "RWUH856876845", 3, 200000);
		CallBuilder obj3=new CallBuilder("Shital", "NBCH74573451", 1, 350000);
		CallBuilder obj4=new CallBuilder("Shyam", "JDKO97986532", 9, 400000);
		CallBuilder obj5=new CallBuilder("Hello", "QBDC56783465", 5, 500000);

		ArrayList<CallBuilder> al=new ArrayList<>();
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		al.add(obj5);

		Collections.sort(al, new CallBuildersRevenue());
		System.out.println("Sorting ArrayList based on Revenue\n");
		System.out.println(al);
		System.out.println("\n");
		Collections.sort(al, new CallBuildersTotalProjects());
		System.out.println("Sorting builder list based on total completed projects\n");
		System.out.println(al);
	}
}
