package shraddha.Assignment51;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
	public static void main(String[] args) {

		CallBuilder obj1=new CallBuilder("Shraddha", "GUJT848347857", 4, 100000);
		CallBuilder obj2=new CallBuilder("Geeta", "RWUH856876845", 3, 200000);
		CallBuilder obj3=new CallBuilder("Rita", "NBCH74573451", 1, 350000);
		CallBuilder obj4=new CallBuilder("Sita", "JDKO97986532", 9, 400000);
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
		System.out.println("---------------------------------------------------------------");
		Collections.sort(al, new CallBuildersTotalCompletedProjects());
		System.out.println("Sorting builder list based on total completed projects\n");
		System.out.println(al);
	}
}
