/*
 * program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
         4

 */
package bhagyashree_Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45_3 {

	void printIndexOfOccurences(ArrayList<String> al, String name) {
		for (int index = 0; index < al.size(); index++) {
			if (al.get(index) == name)
				System.out.println(index);
		}
	}

	public static void main(String[] args) {
		Assignment45_3 ass45 = new Assignment45_3();
		String[] str = { "Techno", "Akanksha", "Mayur", "Chandni", "Akanksha", "Amruta", "Chandni", "Parthav", "Mayur",
				"Amruta", "Credits", "Amruta", "AparnaTiwari", "Akanksha" };
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(str));
		System.out.println("All index of Occurences of Akanksha");
		ass45.printIndexOfOccurences(al, "Akanksha");

	}
}
