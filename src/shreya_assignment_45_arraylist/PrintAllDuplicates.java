/*Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]*/
package shreya_assignment_45_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintAllDuplicates {
	void printDuplicates(ArrayList<String> names) {
		System.out.println("Output : ");
		for (int index = 0; index < names.size(); index++) {
			if (names.indexOf(names.get(index)) != names.lastIndexOf(names.get(index)))
				if (index == names.indexOf(names.get(index)))
					System.out.println(names.get(index) + " ") ;	
			}
	}
	public static void main(String[] args) {
		PrintAllDuplicates printAllDuplicates=new PrintAllDuplicates();
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Techno", "Mayur", "Chandni", "Amruta", "Chandni",
				"Parthav", "Mayur", "Amruta", "Credits", "Amruta"));
		System.out.println("Input : " + names);
		printAllDuplicates.printDuplicates(names);

	}

}
