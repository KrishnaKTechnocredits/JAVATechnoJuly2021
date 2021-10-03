/*
 * Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]

 */
package bhagyashree_Assignment45;

import java.util.ArrayList;

public class Assignment45_1 {

	void removeDuplicateElements(ArrayList<String> al) {
		ArrayList<String> output = new ArrayList<String>();
		for (int index = 0; index < al.size(); index++) {
			if (al.indexOf(al.get(index)) == index) {
				output.add(al.get(index));
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<String>();
		input.add("Techno");
		input.add("Mayur");
		input.add("Chandani");
		input.add("Amruta");
		input.add("Chandani");
		input.add("Parthav");
		input.add("Mayur");
		input.add("Amruta");
		input.add("Credits");
		input.add("Amruta");
		Assignment45_1 ass45 = new Assignment45_1();
		ass45.removeDuplicateElements(input);
	}
}
