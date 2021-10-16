package aniket;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment_46_15 {

	void iterate(Set<String> list) {
		System.out.println("The given list after iterating is : " );
		Iterator<String> itr =list.iterator();
		while(itr.hasNext()) {
			System.out.println( itr.next());
			
		}
	}

	public static void main(String[] args) {

		Set<String> list = new HashSet<String>();
		list.add("Aniket");
		list.add("MSD");
		list.add("Virat");
		list.add("Rohit");
		list.add("Aniket");
		//System.out.println(list.size());
		
		Assignment_46_15 assignment_46_15 = new Assignment_46_15();
		assignment_46_15.iterate(list);
	}
}

