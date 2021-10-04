package arti_G_Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

/*program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]		 
output : [Akanksha, AparnaTiwari]*/
public class Program4 {

	ArrayList<String> printNames(ArrayList<String> names) {
		ArrayList<String> outputList = new ArrayList<String>();
		for (int index = 0; index < names.size(); index++) {
			if (names.get(index).startsWith("A") && names.get(index).length() >= 6) {
				if (index == names.indexOf(names.get(index))) {
					outputList.add(names.get(index));
				}

			}
		}
		return outputList;
	}

	public static void main(String[] args) {
		Program4 p4 = new Program4();
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Techno", "Akanksha", "Mayur", "Chandni",
				"Akanksha", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits", "Amruta"));
		System.out.println("Input list : " + names);
		System.out.println("Output list : " + p4.printNames(names));
	}

}
