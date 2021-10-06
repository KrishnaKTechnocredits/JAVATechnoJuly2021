/*program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]		 
output : [Akanksha, AparnaTiwari]*/
package shalaka.Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListContainsWithA {
	void printNames(ArrayList<String> list) {
		System.out.println("Input:" + list);
		ArrayList<String> outputList = new ArrayList<String>();
		for (String name : list) {
			if (name.startsWith("A") && name.length() > 6) {
				if (!outputList.contains(name))
					outputList.add(name);
			}
		}
		System.out.println("Output:"+outputList);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = { "Techno", "Akanksha", "Mayur", "Chandni", "Akanksha", "Amruta", "Chandni", "Parthav",
				"Mayur", "Amruta", "Credits", "Amruta", "AparnaTiwari" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(input));
		ArrayListContainsWithA arrayListContainsWithA = new ArrayListContainsWithA();
		arrayListContainsWithA.printNames(list);
	}

}
