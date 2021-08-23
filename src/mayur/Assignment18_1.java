package mayur;

import java.util.Arrays;

public class Assignment18_1 {
	String getreverseString(String input) {
		String output = "";
		for(int index=input.length()-1; index>=0; index--) {
			output += input.charAt(index);
		}
		return output;
	}
	
	String [] getreverseArrayAtSamePosition(String[] input) {
		String[] output = new String[input.length];
		int count =0;
		for(int index=0; index<input.length; index++) {
			output[index] = getreverseString(input[index]);
			count++;
		}
		return output;
	}
	public static void main(String[] args) {
		String [] input = {"techno", "credits", "krishna","harsh"};
		Assignment18_1 assignment18_1 = new Assignment18_1();
		String [] output = assignment18_1.getreverseArrayAtSamePosition(input);
		System.out.println("Reverse all elements of an array " + Arrays.toString(input) + " and place it in the reverse order- ");
		System.out.println("Output:- " + Arrays.toString(output));
	}
}



