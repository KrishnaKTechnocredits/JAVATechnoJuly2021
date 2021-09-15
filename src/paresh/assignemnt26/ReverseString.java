package paresh.assignemnt26;

/*Assignment - 26 : 1st Sep'2021

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

import java.util.Arrays;

public class ReverseString {
	// Reverse a given string
	String getReverseString(String input) {

		String reverse = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			reverse += input.charAt(index);
		}
		return reverse;
	}

	// Reverse given string array
	String[] getReverseStringArray(String[] input) {

		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			output[index] = input[(input.length - 1) - index];
		}
		return output;
	}

	// Swap 2 numbers with using 3rd variable
	void getSwapNumber(int num1, int num2) {

		System.out.println("\n Before Swap using 2 variable: " + num1 + " , " + num2);
		int temp = 0;
		temp = num2;
		num2 = num1;
		num1 = temp;
		System.out.println("\n After Swap using 2 variable: " + num1 + " , " + num2);
	}

	// Swap 2 numbers without using 3rd variable
	void getSwaped(int num1, int num2) {

		System.out.println("\n Before Swap using 3 variable: " + num1 + " , " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("\n After Swap using 2 variable: " + num1 + " , " + num2);
	}

	public static void main(String[] args) {

		ReverseString reversestring = new ReverseString();
		String input1 = "This is technocredits";
		String[] input2 = { "Credits", "Techo", "From", "Diwali", "Happy" };
		System.out.println("\n The given string : "+input1);
		String output1 = reversestring.getReverseString(input1);
		System.out.println("\n The reverse string is : " + output1);
		System.out.println("\n The given string array : " + Arrays.toString(input2));
		String[] output2 = reversestring.getReverseStringArray(input2);
		System.out.println("\n The reverse of the string array : " + Arrays.toString(output2));
		reversestring.getSwapNumber(123, 578);
		reversestring.getSwaped(890, 785);
	}
}