/*
 * Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]

 */
package bhagyashree_Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45_2 {

	void printDuplicateElements(ArrayList<String> al) {
		ArrayList<String> output = new ArrayList<String>();
		for (int index = 0; index < al.size(); index++) {
			String name = al.get(index);
			if (al.indexOf(name) != al.lastIndexOf(name)) {
				if (al.indexOf(name) == index) {
					output.add(name);
				}
			}
		}
		System.out.println(output);

	}

	public static void main(String[] args) {
		Assignment45_2 ass45 = new Assignment45_2();
		String[] input = { "Techno", "Mayur", "Chandni", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits",
				"Amruta" };
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(input));
		ass45.printDuplicateElements(al);
	}

}
