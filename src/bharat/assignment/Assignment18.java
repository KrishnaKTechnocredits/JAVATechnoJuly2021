package bharat.assignment;

import java.util.Arrays;

public class Assignment18 {
	
	String getReverseString(String input) {
		String output ="";
		for(int index = input.length()-1;index >= 0;index--) {
			output = output + input.charAt(index); 
		}
		
			return output;
}
	
	String[] getReversStringArray(String[] input) {
		for(int index = 0;index < input.length;index++) {
			input[index] = getReverseString(input[index]);
			
		}
		
			return input;
	}
	
	String[] getReserversStringArrayReverse(String[] input) {
		String output[] = new String[input.length];
		for (int index = 0; index < input.length;index++) {
			output[(input.length - 1)- index] = getReverseString(input[index]);
		}
		return output;
 	}
	
	
	public static void main (String[] args) {
		Assignment18 assignment18 = new Assignment18();
		String[] input1 = {"Technocredits","Bharatt","pune"};
		System.out.println("Reverse of string array  "+ Arrays.toString(assignment18.getReserversStringArrayReverse(input1)));
		String[] input2 = {"Technocredits","Bharat","pune","histoy"};
		System.out.println("Reverse of revers string array "+ Arrays.toString(assignment18.getReserversStringArrayReverse(input2)));

	}
}
