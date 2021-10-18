/* Assignment 46 - Collections : 4th Oct'2021
Example 5 : Remove the longest string from given Set. */

package manaswi;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment_46_Program_5 
{

	void fingLongestString(Set<String> str)
	{
		int max=0;
		String output = "";
		for(String name : str) 
		{
			if(name.length()>max) 
			{
				max = name.length();
				output = name;
			}
		}
		System.out.println("'" + output + "' is the longest string in the list " + str);
	}

	public static void main(String[] args) 
	{
		String[] str = {"hi", "hello", "good morning", "happy", "manaswi"};
		Set<String> s = new LinkedHashSet<String>(Arrays.asList(str));
		Assignment_46_Program_5 p5 = new Assignment_46_Program_5();
		p5.fingLongestString(s);
	}
}