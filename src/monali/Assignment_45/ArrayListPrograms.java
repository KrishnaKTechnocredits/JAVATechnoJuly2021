package monali.Assignment_45;

import java.util.ArrayList;

/*
 * Program : remove all occurrences of Amruta input :
 * ["Techno","Chandni","Amruta","Parthav", "Mayur","Amruta","Credits","Amruta"]
 * output : ["Techno","Chandni","Parthav", "Mayur","Credits"]
 */
public class ArrayListPrograms {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Techno");
		al.add("Chandni");
		al.add("Amruta");
		al.add("Monali");
		al.add("Aniket");
		al.add("Mayur");
		al.add("Amruta");
		al.add("Sheela");
		al.add("Amruta");
		System.out.println(al);
		// Whole loop iterate
		/*
		 * for (int index = 0; index < al.size(); index++) { if (al.contains("Amruta"))
		 * { al.remove("Amruta"); } } System.out.println(al);
		 */

		// loop should iterate only when name contains amruta...this is right approach
		while (al.contains("Amruta")) {
			al.remove("Amruta");
		}
		System.out.println(al);
	}
}
