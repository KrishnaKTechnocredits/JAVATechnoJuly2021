package laxman;

import java.util.Arrays;

//Program : 1 
//WAP to print Reverse a given String.
//input : This is technocredits
//output : stiderconhcet si sihT  
//
//Program : 2 
//reverse given string array.
//input : {"Credits", "Techno","From","Diwali","Happy"}
//output : {"Happy","Diwali","From","Techno","Credits"}
//
//Program : 3 
//swap 2 numbers with using 3rd variable
//
//Program : 4 swap 2 numbers without using 3rd variable

public class Assignment26 {

	String reverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}

	void resverseArray(String[] input) {
		String arr[] = new String[input.length];
		int i = 0;
		for (int index = input.length - 1; index >= 0; index--) {
			arr[i] = input[index];
			i++;
		}
		System.out.println(Arrays.toString(arr));
	}

	void swapWithOutVariable() {
		int x = 10, y = 20;
		System.out.println("Before swapping values " + x + " " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping values without variable " + x + " " + y);
	}

	void swapWithVariable() {
		int x = 10, y = 20;
		System.out.println("Before swapping values " + x + " " + y);
		int temp = x;
		x = y;
		y = temp;

		System.out.println("After swapping values with variable " + x + " " + y);

	}

	public static void main(String[] args) {
		Assignment26 assignment26 = new Assignment26();
		String ans = assignment26.reverseString("This is technocredits");
		System.out.println(ans);
		String[] str = { "Credits", "Techno", "From", "Diwali", "Happy" };
		assignment26.resverseArray(str);
		assignment26.swapWithOutVariable();
		assignment26.swapWithVariable();
	}
}
