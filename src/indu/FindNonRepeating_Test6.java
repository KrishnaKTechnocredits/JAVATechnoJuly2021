/*
 * Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h 

Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is 
output : techno
 */
package indu;

import java.util.Arrays;

public class FindNonRepeating_Test6 {

	void getNonRepeatingChar()
	{
		String str = "Technocredits";
		char ch = ' ';
		for(int index=0;index <str.length();index++)
		{
			if(str.lastIndexOf(str.charAt(index))== index)
			{
				ch = str.charAt(index);
				break;
			}
		}
		System.out.println("The non repeating char in "+str+" is : "+ ch);
	}
	
	void getNonRepeatingWord(String str)
	{
		
		String [] input = str.split(" ");
		String output="";
		for(int outerIndex=0 ;outerIndex<input.length ;outerIndex++)
		{
			int count =0;
			for(int innerIndex=0 ;innerIndex<input.length ;innerIndex++)
			{
				if(input[outerIndex].equalsIgnoreCase(input[innerIndex]))
				{
					count++;
				}
			}
			if(count==1)
			{
				output=input[outerIndex];
				break;
			}
		
		}
		System.out.println("Non Repeating Word in given Array \n"+ Arrays.toString(input)+ "  : "+output);
	}
	
	public static void main(String[] args) {
		FindNonRepeating_Test6 findNonRepeating_Test6 = new FindNonRepeating_Test6();	
		findNonRepeating_Test6.getNonRepeatingChar();
		String str = "hi this is techno gm credits this hi is";
		findNonRepeating_Test6.getNonRepeatingWord(str);
	}
}
