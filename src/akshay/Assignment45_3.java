/*program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
         4*/


package akshay;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45_3 {
	
	void indexOfElement(String [] arr) {
		ArrayList<String> a1 = new ArrayList<>(Arrays.asList(arr));
		System.out.print("output: ");
		for(int index = 0; index < a1.size(); index++) {
			if(a1.get(index).equals("Akanksha"))
				System.out.print(" " +index);
		}
	}
	
	public static void main(String[] args) {
		Assignment45_3 assignment45_3 = new Assignment45_3();
		String [] input = {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		System.out.println("input: " + Arrays.toString(input));
		assignment45_3.indexOfElement(input);
	}
}
