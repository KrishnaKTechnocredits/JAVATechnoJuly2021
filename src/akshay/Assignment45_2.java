/*Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]*/

package akshay;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45_2 {
	
	ArrayList<String> dispalyDuplicate(String [] arr){
		ArrayList<String> a1 = new ArrayList<>(Arrays.asList(arr));
		ArrayList<String> a2 = new ArrayList<>();
		
		for(int index = 0; index < a1.size(); index++) {
			String name = a1.get(index);
			if(a1.indexOf(name) != a1.lastIndexOf(name) && !a2.contains(name)) {
				a2.add(name);
			}
		}
		
		return a2;
	}
	
	public static void main(String[] args) {
		
		Assignment45_2 assignment45_2 = new Assignment45_2();
		String [] input = {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		System.out.println("input: " + Arrays.toString(input));
		System.out.println("Duplicate elements in the list are");
		System.out.println("output: " +assignment45_2.dispalyDuplicate(input));
	}
}
