/*Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]*/

package akshay;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45_1 {
	
	ArrayList<String> removeDuplicate(String [] arr){
		ArrayList<String> a1 = new ArrayList<>(Arrays.asList(arr));
		ArrayList<String> a2 = new ArrayList<>();
		for(int index = 0; index < a1.size(); index++ ) {
			String name = a1.get(index);
			if(a1.indexOf(name) != a2.indexOf(name)) {
				a2.add(name);
			}
		}
		
		return a2;
	}

	public static void main(String[] args) {
		Assignment45_1 assignment45_1 = new Assignment45_1();
		String [] input = {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		System.out.println("input: " +Arrays.toString(input));
		System.out.println("After removing duplicate elements");
		System.out.println("output: " +assignment45_1.removeDuplicate(input));
	}
}
