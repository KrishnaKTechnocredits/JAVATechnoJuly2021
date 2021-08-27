package indu;

import java.util.Arrays;

public class Assignment_18 
{

	String[] getReverseStringofAlltheElementsinArray(String[] input)
	{
		String[] output = new String[input.length];
		for (int index = 0; index<input.length ; index++)
		{	
			String tempString ="";
			for(int index1 = input[index].length()-1; index1>=0 ;index1--)
			{
				tempString  += input[index].charAt(index1); 
				output[index] = tempString;
			}
		}
		return output;
	}
	
	String[] reverseStringArrayinReverseOrder(String[] input)
	{
		int temp =0;
	 	String[] output = new String[input.length];
		for (int index=input.length-1; index>=0 ;index--)
		{
			output[temp]=getReverseString(input[index]);
			temp++;
		}
		return output;
	}
	
	String getReverseString(String input)
	{
		String output = "";
		for(int index = input.length()-1; index>=0 ;index--)
		{
			output += input.charAt(index);
		}
		//System.out.println(output);
		return output;
	}
	
	public static void main(String[] arg)
	{
		Assignment_18 assignment_18 = new Assignment_18();
		String[] input = {"JEET","NEHA","TEJAL","GOPAL"};
		System.out.println("\nInput Array of String is : " + Arrays.toString(input));
		System.out.println("\nReverse Element of the String Array is : " +
				Arrays.toString(assignment_18.getReverseStringofAlltheElementsinArray(input)));
		assignment_18.getReverseString("Indu");
		System.out.println("\nReverse Element of String in Reverse order is : " +
				Arrays.toString(assignment_18.reverseStringArrayinReverseOrder(input)));
	}
}
