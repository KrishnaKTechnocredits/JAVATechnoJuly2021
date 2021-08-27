package manaswi;

import java.util.Arrays;

public class Assignment_18
{

	String getReverseString(String input){
		String output = "";
		for (int index = input.length()-1;index >= 0; index--){
			 output = output + input.charAt(index); 
		}
			return output;
	}

	String[] getReverseStringArray(String[] input){
		for (int index = 0;index < input.length; index++){
			input[index] = getReverseString(input[index]);

		}
			return input;
	}

	String[] getReverseStringArrayReversed(String[] input){
		String output[] = new String[input.length];		
			for (int index = 0; index < input.length; index++){
				output[(input.length - 1) - index] = getReverseString(input[index]); 
			}
			return output;
	}



	public static void main (String[] args){
		Assignment_18 assignment_18a = new Assignment_18();	
		String[] input1 = {"Technocredit","Manaswi","Diva","Sudarshan","Manas"};
		System.out.println("Reverse of string array is : " + Arrays.toString(assignment_18a.getReverseStringArray(input1)));
		String[] input2 = {"Technocredits", "Manaswi", "Diva", "Sudarshan", "Manas", "Manushri"};
		System.out.println("Reverse of reversed string array is : " + Arrays.toString(assignment_18a.getReverseStringArrayReversed(input2)));

	}	
}