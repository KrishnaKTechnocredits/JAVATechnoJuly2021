/*
 * Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]

 */
package husain.Assignment45;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Program1 {

	void removeDuplicates(ArrayList<String> names) {

		System.out.println("\nOutput with duplicates removed");
		for (int index = 0; index < names.size(); index++) {
			if (names.indexOf(names.get(index)) != names.lastIndexOf(names.get(index)))
				names.remove(names.lastIndexOf(names.get(index)));
		}

		System.out.print(names);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Program1 obj = new Program1();
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Techno", "Mayur", "Chandni", "Amruta", "Chandni",
				"Parthav", "Mayur", "Amruta", "Credits", "Amruta"));
		System.out.println("Input List " + names);
		obj.removeDuplicates(names);
	}

}
