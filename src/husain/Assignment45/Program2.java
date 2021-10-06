/*
 * Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]

 */
package husain.Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class Program2 {

	void printDuplicates(ArrayList<String> names) {

		System.out.println("\nOutput containing duplicates :");

		for (int index = 0; index < names.size(); index++) {

			if (names.indexOf(names.get(index)) != names.lastIndexOf(names.get(index)))
				if (index == names.indexOf(names.get(index)))
					System.out.print(names.get(index) + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Program2 obj = new Program2();
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Techno", "Mayur", "Chandni", "Amruta", "Chandni",
				"Parthav", "Mayur", "Amruta", "Credits", "Amruta"));
		System.out.println("Input list " + names);
		obj.printDuplicates(names);

	}

}
