package chandani_Assignment_26;

import java.util.Arrays;

public class Assignment26b{

	String[] getReverseStringArrayReversed(String[] input){
		String output[] = new String[input.length];		
			for (int index = 0; index < input.length; index++){
				output[(input.length - 1) - index] = input[index]; 
			}
			return output;
	}
	
	public static void main (String[] args){
		Assignment26b assignment26b = new Assignment26b();	
		String[] input1 = {"Credits", "Techno","From","Diwali","Happy"};
		System.out.println("Reverse of string array  " + Arrays.toString(input1) + " is : "  + Arrays.toString(assignment26b.getReverseStringArrayReversed(input1)));
	}	
}