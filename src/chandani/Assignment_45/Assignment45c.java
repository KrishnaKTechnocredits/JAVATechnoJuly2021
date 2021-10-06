/*program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
         4*/
package chandani.Assignment_45;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45c {
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
			names.add("Techno");
			names.add("Akanksha");
			names.add("Mayur");
			names.add("Chandni");
			names.add("Akanksha");
			names.add("Amruta");
			names.add("Chandni");
			names.add("Parthav");
			names.add("Mayur");
			names.add("Amruta");
			names.add("Credits");
			names.add("Amruta");
			
		System.out.println("Index of element Akanksha in the Array List String " +"\n"+ Arrays.asList(names) + "\n");	
		for(int index = 0; index < names.size(); index++) {
			if(names.get(index).contains("Akanksha")) {
			 System.out.println(index);
			}
		}	
	}
}
