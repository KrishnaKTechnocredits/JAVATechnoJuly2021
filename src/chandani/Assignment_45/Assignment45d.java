/*program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
		input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]*/
package chandani.Assignment_45;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45d {

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
	names.add("AparnaTiwari");
	
	ArrayList<String> temp = new ArrayList<String>();
	for(String name : names) {
		if(!temp.contains(name) && (name.startsWith("A") && name.length() > 6)) {
			temp.add(name);
		}
	}
	System.out.println("String starting with A and length more than 6" + "\n" + 
	Arrays.asList(names) + "\n ------------\n" + temp);
 }
}