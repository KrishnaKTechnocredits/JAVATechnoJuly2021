/*Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]*/
package chandani.Assignment_45;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45b {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
			names.add("Techno");
			names.add("Mayur");
			names.add("Chandni");
			names.add("Amruta");
			names.add("Chandni");
			names.add("Parthav");
			names.add("Mayur");
			names.add("Amruta");
			names.add("Credits");
			names.add("Amruta");
			
		ArrayList<String> names1 = new ArrayList<String>();
	
	for(int index = 0; index < names.size(); index++) {
		if(names.indexOf(names.get(index)) != names.lastIndexOf(names.get(index))){
			if(!names1.contains(names.get(index))){
				names1.add(names.get(index));
			}
		}
	}
	
	System.out.println("After removing all the duplicate occurences from the ArrayList String "
		+ "\n"	+ Arrays.asList(names) + "\n\noutput : " + names1);
}
}
