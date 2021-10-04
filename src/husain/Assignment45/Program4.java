/*
 * program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]		 
output : [Akanksha, AparnaTiwari]
 */
package husain.Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class Program4 {

	ArrayList<String> printNames(ArrayList<String> names) {

		ArrayList<String> outputList = new ArrayList<String>();

		for (int index = 0; index < names.size(); index++) {
			if (names.get(index).startsWith("A") && names.get(index).length() > 6)
				if (index == names.indexOf(names.get(index)))
					outputList.add(names.get(index));
		}
		return outputList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program4 obj = new Program4();
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Techno", "Akanksha", "Mayur", "Chandni",
				"Akanksha", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits", "Amruta", "AparnaTiwari"));
		System.out.println("Input list " + names);
		System.out.println(
				"Output list with names beginning with A and having length greater than 6 " + obj.printNames(names));
	}

}
