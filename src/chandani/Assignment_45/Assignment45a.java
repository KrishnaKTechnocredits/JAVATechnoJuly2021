/*Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]*/
package chandani.Assignment_45;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45a {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>() ;
		
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
		for(int index=0;index<names.size();index++) {
			if(!names1.contains(names.get(index))) {
					names1.add(names.get(index));
			}	
		}
		System.out.println("Single occurence of elements in the given ArrayList string" + "\n" + Arrays.asList(names) + "\noutput : " + names1);
	}
}
		
	
	
