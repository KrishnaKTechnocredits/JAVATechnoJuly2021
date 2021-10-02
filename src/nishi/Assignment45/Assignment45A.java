/*Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]*/

package nishi.Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45A {
	public static void main(String[] args) {
		String[] arr= {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		ArrayList<String> al=new ArrayList<>(Arrays.asList(arr));		
		for(int index=0;index<al.size();index++)
		{
			String name=al.get(index);
			if(al.indexOf(name)!=al.lastIndexOf(name))
			{
				al.remove(al.lastIndexOf(name));				
			}
		}
		System.out.println("output : " +al);
	}
}
