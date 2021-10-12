package aniket;

import java.util.ArrayList;
import java.util.Iterator;

//Example 14: Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.
public class Assignment_46_13 {

	void traverse(ArrayList<String> list) {
		System.out.println("Using for each : ");
		for( String name : list )
		{
			System.out.println(name);
		}
		
		System.out.println("Using iterator : ");
		Iterator<String> itr =list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Aniket");
		list.add("MSD");
		list.add("Virat");
		list.add("Rohit");
		Assignment_46_13 assignment_46_13 = new Assignment_46_13();
		assignment_46_13.traverse(list);
		
	}

}

