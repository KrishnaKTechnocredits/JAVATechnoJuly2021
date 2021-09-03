/*
 Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  

Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}

Program : 3 
swap 2 numbers with using 3rd variable

Program : 4 
swap 2 numbers without using 3rd variable
 */
package umakant;

import java.util.Arrays;

public class Assignment26 {

	String getReverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output += input.charAt(index);
		}
		return output;
	}

	String[] getReverseStringArray(String[] input) {
		String[] output = new String[input.length];
		for (int index = input.length - 1; index >= 0; index--) {
			output[input.length - 1 - index] = input[index];
		}
		return output;
	}

	void swapNumbersUsing3rdVariable(int number1, int number2) {
		System.out.println("Before SWAP, Number1=" + number1 + " & Number2=" + number2);
		int temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("After SWAP, Number1=" + number1 + " & Number2=" + number2);
	}

	void swapNumbersWithoutUsing3rdVariable(int number1, int number2) {
		System.out.println("Before SWAP, Number1=" + number1 + " & Number2=" + number2);
		number1 = number1 + number2;
		number2 = number1 - number2;// number1+number2-number2=number1
		number1 = number1 - number2;// number1+number2-number1=number2
		System.out.println("After SWAP, Number1=" + number1 + " & Number2=" + number2);
	}

	public static void main(String[] args) {
		Assignment26 assignment26 = new Assignment26();
		System.out.println("***String Reverse***");
		String input1 = "This is technocredits";
		System.out.println(assignment26.getReverseString(input1));
		System.out.println("***String Array Reverse***");
		String[] input2 = { "Credits", "Techno", "From", "Diwali", "Happy" };
		System.out.println(Arrays.toString(assignment26.getReverseStringArray(input2)));
		System.out.println("***Swap two numbers using 3rd variable***");
		assignment26.swapNumbersUsing3rdVariable(10, 15);
		System.out.println("***Swap two numbers without using 3rd variable***");
		assignment26.swapNumbersUsing3rdVariable(20, 15);
	}
}
