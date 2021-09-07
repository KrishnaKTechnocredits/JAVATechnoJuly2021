package arti_G_Assignment26;

import java.util.Arrays;

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
public class ReverseString {

	// 1st program
	String reverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}

	// 2nd program
	String[] reverseStringArray(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0; index <= input.length - 1; index++) {
			output[index] = input[(input.length - 1) - (index)];
		}
		return output;
	}

	// 3rd program
	void swapNumberUsing3Variable(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
		System.out.println("Swap two numbers with using 3 Variables");
		System.out.println("Value of x is - " + x + " Value of y is - " + y);

	}

	// 4th program
	void swapNumberWithoutUsing3Variable(int x, int y) {
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("Swap two numbers without using 3 Variables");
		System.out.println("Value of x = " + x + " Value of y =" + y);

	}

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		System.out.println("Reverse the String - " + reverseString.reverseString("This is technocredits"));
		String[] input = { "Credits", "Techno", "From", "Diwali", "Happy" };
		System.out.println("Reverse Arrat String is - " + Arrays.toString(reverseString.reverseStringArray(input)));
		reverseString.swapNumberUsing3Variable(50, 60);
		reverseString.swapNumberWithoutUsing3Variable(10, 20);

	}

}
