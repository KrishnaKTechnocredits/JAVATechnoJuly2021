package astha.Assignment51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		Builder builder2 = new Builder("Astha", "ABCD1122", 8, 1000);
		Builder builder3 = new Builder("Ankita", "BCDE2233", 7, 1500);
		Builder builder1 = new Builder("Akritee", "CDEF3344", 9, 2000);
		Builder builder4 = new Builder("Aditee", "DEFG4455", 15, 3000);
		Builder builder5 = new Builder("Abha", "EFGH5566", 20, 2500);

		List<Builder> List = new ArrayList<Builder>();
		List.add(builder1);
		List.add(builder2);
		List.add(builder3);
		List.add(builder4);
		List.add(builder5);
		System.out.println(List);
		Collections.sort(List,new Builder_Revenue());
		System.out.println(List);
		Collections.sort(List,new Builder_TotalProjects());
		System.out.println(List);
		}

}