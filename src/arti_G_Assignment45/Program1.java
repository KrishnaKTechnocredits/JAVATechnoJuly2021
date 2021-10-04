package arti_G_Assignment45;

import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.Arrays;

/*Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]*/

public class Program1 {

	void removeDuplicates(ArrayList<String> names) {
		System.out.println("Removed Duplicates output : ");
		for (int index = 0; index < names.size(); index++) {
			if (names.indexOf(names.get(index)) != names.lastIndexOf(names.get(index))) {
				names.remove(names.lastIndexOf(names.get(index)));
			}

		}
		System.out.println(names);
	}

	public static void main(String[] args) {
		Program1 e1 = new Program1();
		ArrayList<String> names = new ArrayList(Arrays.asList("Techno", "Mayur", "Chandni", "Amruta", "Chandni",
				"Parthav", "Mayur", "Amruta", "Credits", "Amruta"));
		System.out.println("Input string is : " + names);
		e1.removeDuplicates(names);

	}

}
