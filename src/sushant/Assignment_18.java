/*Program 1 : Reverse all elements of an array at same position  
String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
output : [ivhdam, ihbrus, ahen, hsednas, tikna, vahbiav]

Note : you can print array content directly using sop(Arrays.toString(output)); toString() method of Arrays class return String. 

Method should take String array and return String array.

Program 2 : Reverse all elements and place it in a reverse order

String[] input = {"techno", "credits", "krishna","harsh"}
output : [hsrah, anhsirk, stiderc, onhcet]

Note : use sop(Arrays.toString(output)) to print the array content.*/

package sushant;

import java.util.Arrays;

public class Assignment_18 {

	String[] reverseAtSamePosition(String[] input)
	{
		for(int i=0;i<input.length;i++)
		{
			input[i]=reverseString(input[i]);
		}
		return input;
	}

	String[] reverseAtReversePosition(String[] input)
	{
		String[] reverse = new String[input.length];
		for(int i=0;i<input.length;i++)
		{
			input[i]=reverseString(input[i]);			
		}
		for(int j=0;j<input.length;j++)
		{
			reverse[j]=input[input.length-j-1];
		}
		return reverse;
	}


	static String reverseString(String input)
	{
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			output+=input.charAt(i);
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment_18 assignment_18=new Assignment_18();
		String[] input1 = {"madhvi","surbhi","neha","sandesh","ankit","vaibhav"};
		String[] output1=assignment_18.reverseAtSamePosition(input1);
		System.out.println("Reverse at same position "+Arrays.toString(output1));
		String[] input2 = {"techno","credits","krishna","harsh"};
		String[] output2=assignment_18.reverseAtReversePosition(input2);
		System.out.println("Reverse at reverse position "+Arrays.toString(output2));		

	}

}