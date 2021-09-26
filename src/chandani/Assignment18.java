package chandani;

import java.util.Arrays;

public class Assignment18{

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
		Assignment18 assignment18a = new Assignment18();	
		String[] input1 = {"Technocredits", "Chandni", "Husain", "Deepak", "Astha", "Suru"};
		System.out.println("Reverse of string array is : " + Arrays.toString(assignment18a.getReverseStringArray(input1)));
		String[] input2 = {"Technocredits", "Chandni", "Husain", "Deepak", "Astha", "Suru"};
		System.out.println("Reverse of reversed string array is : " + Arrays.toString(assignment18a.getReverseStringArrayReversed(input2)));

	}	
}