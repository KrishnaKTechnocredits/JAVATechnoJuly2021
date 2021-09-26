package suchita;

import java.util.Arrays;

class Assignment26 {

	//Reverse a given string
	String getReverseString(String input) {
		
		String reverse = "";
		for(int index=input.length()-1;index>=0;index--) {
			reverse += input.charAt(index);
		}
		return reverse;
	}
	
	//Reverse given string array
	String[] getReverseStringArray(String[] input) {
		
		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			output[index] = input[(input.length - 1) - index];
		}
		return output;
	}
	
	//Swap 2 numbers with using 3rd variable
	void getSwapNumber(int num1, int num2) {
		
		System.out.println("\n Given numbers : "+ "\n Number1 : " +num1 +"\n Number2 : "+ num2);
		int num3 = 0;
		num3 = num2;
		num2 = num1;
		num1 = num3;
		System.out.println( "\n" + "The swaped numbers " +"\n Number1 : " +num1 +"\n Number2 : "+ num2);
	}
	
	//Swap 2 numbers without using 3rd variable
	void getSwaped(int num1 , int num2) {
		
		System.out.println("\n Given numbers : "+ "\n Number1 : " +num1 +"\n Number2 : "+ num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("\n Given numbers : "+ "\n Number1 : " +num1 +"\n Number2 : "+ num2);
	}
	
	public static void main(String[] args) {
		
		Assignment26 assignment = new Assignment26();
		String input1 = "This is technocredits";
		String[] input2 = {"Credits","Techo","From","Diwali","Happy"};
		String output1 = assignment.getReverseString(input1);
		System.out.println("\n The reverse string is :: " + output1);
		System.out.println("\n The given string array :: " + Arrays.toString(input2));
		String[] output2 = assignment.getReverseStringArray(input2);
		System.out.println("\n The reverse of the string array :: " + Arrays.toString(output2));
		assignment.getSwapNumber(121,232);
		assignment.getSwaped(232,323);
	}
}