/*
Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]

*/
package purshottamJoshi;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45_1 {
	
	
	public static void main(String[] args) {
		
		String[] input= {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		
		ArrayList<String> al = new ArrayList<>(Arrays.asList(input));
		ArrayList<String> output = new ArrayList<>();
		
			for(int index=0; index < al.size();index++) {
				if(al.indexOf(al.get(index)) == index)  {
					output.add(al.get(index));
					
				}
			}
			System.out.println(output);
	}
}
