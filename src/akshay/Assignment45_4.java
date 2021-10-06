/*program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]		 
output : [Akanksha, AparnaTiwari]*/

package akshay;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45_4 {
	
	ArrayList<String> nameStartsWith(String [] arr){
		ArrayList<String> a1 = new ArrayList<>(Arrays.asList(arr));
		ArrayList<String> a2 = new ArrayList<>();
		for(int index = 0; index < a1.size(); index++) {
			if(a1.get(index).contains("A") && a1.get(index).length()>6) {
				if(!a2.contains(a1.get(index)))
					a2.add(a1.get(index));
			}
		}
		
		return a2;
	}
	
	public static void main(String[] args) {
		Assignment45_4 assignment45_4 = new Assignment45_4();
		String [] input = {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"};
		System.out.println("input: " +Arrays.toString(input));
		System.out.println("Names start with 'A' in the list are");
		System.out.println("output: " +assignment45_4.nameStartsWith(input));
	}
	
}
