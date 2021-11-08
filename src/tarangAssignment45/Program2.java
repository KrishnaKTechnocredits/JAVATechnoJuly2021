package tarangAssignment45;

import java.util.ArrayList;
import java.util.Arrays;

/*Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]*/


public class Program2 {

	// 2 program
	void printDuplicates(ArrayList<String> names) {
		System.out.println("Output containing duplicates :");
		for (int index = 0; index < names.size(); index++) {
			if (names.indexOf(names.get(index)) != names.lastIndexOf(names.get(index)))
				if (index == names.indexOf(names.get(index))) {
					System.out.print(names.get(index) + " ");
				}
		}

	}

	public static void main(String[] args) {
		Program2 e1 = new Program2();
		ArrayList<String> names = new ArrayList(Arrays.asList("Techno", "Mayur", "Chandni", "Amruta", "Chandni",
				"Parthav", "Mayur", "Amruta", "Credits", "Amruta"));
		System.out.println("Input string is : " + names);
		e1.printDuplicates(names);
	}

}
