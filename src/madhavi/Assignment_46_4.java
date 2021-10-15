package madhavi;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
//Write a program to remove duplicate from ArrayList (using set).


public class Assignment_46_4 {
	public static void main(String[] args) {
		System.out.println("to remove duplicate from ArrayList (using set)");
		System.out.println("--------------------------------------------------");
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(10);
		intlist.add(100);
		intlist.add(20);
		intlist.add(200);
		intlist.add(50);
		intlist.add(200);
		intlist.add(100);
		intlist.add(500);
		System.out.println("An initial list of elements: " + intlist);
		Set<Integer> s = new LinkedHashSet<Integer>(intlist);
		System.out.println("Present element is in set: " + s);

	}

}
