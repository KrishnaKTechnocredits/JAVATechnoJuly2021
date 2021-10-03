package bhagyashree_Assignment45;

import java.util.ArrayList;

public class Assignment45 {

	/*
	 * Program : remove all occurrences of Amruta input :
	 * ["Techno","Chandni","Amruta","Parthav", "Mayur","Amruta","Credits","Amruta"]
	 * output : ["Techno","Chandni","Parthav", "Mayur","Credits"]
	 * 
	 */
	void removeAllOccurences(ArrayList<String> al) {

		while (al.contains("Amruta")) {
			al.remove("Amruta");
		}

		System.out.println(al);
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("Techno");
		list.add("Chandni");
		list.add("Amruta");
		list.add("Mayur");
		list.add("Parthav");
		list.add("Amruta");
		Assignment45 ass45 = new Assignment45();
		ass45.removeAllOccurences(list);
	}

}
