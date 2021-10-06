/*Assignment-45 : 2nd Oct


Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]
*/
package indu.Assignment_45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatefromArrayList_A45_1 {

	void removeDuplicates(String[] str)
	{
		List<String> list = Arrays.asList(str);
		ArrayList<String> names = new ArrayList<String>(list);
		ArrayList<String> output = new ArrayList<String>();
		System.out.println("Input string :"+names);
		
		for(int index=0;index<names.size();index++)
		{
			if(index==names.indexOf(names.get(index)))
			{
				output.add(names.get(index));
			}
		}
		System.out.println("\nAfter removing duplicates from arraylist and having single occurence in the List: ");
		System.out.println("\nOutPut is : "+output);
	}
	public static void main(String[] args) {
		RemoveDuplicatefromArrayList_A45_1 a45_1 = new RemoveDuplicatefromArrayList_A45_1();
		String[] input = {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		a45_1.removeDuplicates(input);
	}
}
