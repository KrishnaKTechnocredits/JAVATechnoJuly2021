/*Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]*/

package nishi.Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45B {

	public static void main(String[] args) {
		String[] arr= {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		ArrayList<String> al=new ArrayList<>(Arrays.asList(arr));
		ArrayList<String> newAl=new ArrayList<String>();
		for(int index=0;index<al.size();index++)
		{
			String name=al.get(index);
			if(index!=al.lastIndexOf(name) && (!newAl.contains(name)))
			{			
				newAl.add(name);				
			}
		}
		System.out.println("output : " +newAl);
		
	}
}

