/* Assignment-45 : 2nd Oct’2021
Program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]		 
output : [Akanksha, AparnaTiwari] */

package akanksha_Jain.Assignment_45;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_4 {
	
	void getNames(ArrayList<String> list) {
		System.out.println("ArrayList which contains names starts with A and having length more than 6 chars from input- ");
		System.out.println(list);
		ArrayList<String> outputList = new ArrayList<String>();
		for(String name : list) {
			if(name.startsWith("A") && name.length()>6)
				if(!outputList.contains(name))
					outputList.add(name);
		}
		System.out.println("Output: " + outputList);
	}

	public static void main(String[] args) {
		String[] input = {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(input));
		Program_4 p4 = new Program_4();
		p4.getNames(list);
	}
}