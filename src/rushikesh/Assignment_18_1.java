package rushikesh;

import java.util.Arrays;

public class Assignment_18_1 {
	String revString(String input) {
		String output=" ";
		for(int index=input.length()-1;index>=0;index--) {
			output+=input.charAt(index);
		}
		return output;
	}

	String[] reverseStringArr(String[] input) {

		for(int index=0;index<input.length;index++) {
			input[index]=revString(input[index]);
		}
		return input;
	}	
	public static void main(String[] args) {
		Assignment_18_1 assignment_18_1=new Assignment_18_1();
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		assignment_18_1.reverseStringArr(input);
		System.out.println(Arrays.toString(input));
	}
	
}
