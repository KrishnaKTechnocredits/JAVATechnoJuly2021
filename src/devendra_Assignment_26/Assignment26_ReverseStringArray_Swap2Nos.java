package devendra_Assignment_26;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment26_ReverseStringArray_Swap2Nos {
	private static Scanner scanner;
	/*Program1*/
	void loopArray(String str) {
		String arr[] = str.split(" ");
		String output = "";
		for (int index = arr.length - 1; index >= 0; index--) {
			output = output + reverseString(arr[index]) + " ";
		}
		System.out.println("Output string: " + output.trim());
	}

	String reverseString(String str) {
		String rev = "";
		for (int index = str.length() - 1; index >= 0; index--)
			rev = rev + str.charAt(index);
		return rev;
	}	
	/*Program2*/
	void reverseArray(String arr[]) {
		String output[] = new String[arr.length];
		for (int index = 0; index < arr.length; index++)
			output[index] = arr[arr.length - index - 1];
		System.out.println("Output array is: " + Arrays.toString(output));
	}
	/*Program3*/
	void swapNumbers(int num1, int num2) {
		int temp = 0;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swapping, \n1st No. is " + num1 + " \n2nd No is " + num2);
	}
	/*Program4*/
	void swapDigits(int dig1, int dig2) {
		dig1 = dig1 + dig2;
		dig2 = dig1 - dig2;
		dig1 = dig1 - dig2;
		System.out.println("After Swapping, \n1st No. is " + dig1 + " \n2nd No. is " + dig2);
	}
	/*Main Method*/
	public static void main(String[] args) {
		Assignment26_ReverseStringArray_Swap2Nos obj = new Assignment26_ReverseStringArray_Swap2Nos();	
		/*P1*/
		System.out.println("Program One"); 
		String str = "This is Technocredits";
		System.out.println("Input String : " + str);
		obj.loopArray(str);
		/*P2*/
		System.out.println("------------------------------\nProgram Two"); 
		String input[] = { "Credits", "Techno", "From", "Diwali", "Happy" };
		System.out.println("Input Array is : " + Arrays.toString(input));
		obj.reverseArray(input);
		/*P3*/
		System.out.println("------------------------------\nProgram Three"); 
		scanner = new Scanner(System.in);
		System.out.println("Enter 1st No. : ");
		int num1 = scanner.nextInt();
		System.out.println("Enter 2nd No. : ");
		int num2 = scanner.nextInt();
		obj.swapNumbers(num1, num2);
		/*P4*/
		System.out.println("------------------------------\nProgram Four"); 
		System.out.println("Enter 1st No. : ");
		int dig1 = scanner.nextInt();
		System.out.println("Enter 2nd No. : ");
		int dig2 = scanner.nextInt();
		obj.swapDigits(dig1, dig2);
	}
}