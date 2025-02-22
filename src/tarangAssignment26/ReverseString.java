package tarangAssignment26;


import java.util.Arrays;

public class ReverseString {





	String reverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}
	String[] reverseStringArray(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0; index <= input.length - 1; index++) {
			output[index] = input[(input.length - 1) - (index)];
		}
		return output;
	}
	void swapNousing3Var(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
		System.out.println("Swap 2 no with 3rd Variable");
		System.out.println("Value of x is " + x + " and Value of y is " + y);

	}


	void swapNowithout3rdvar(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Swaping of 2no without 3rd Variable");
		System.out.println("Value of a " + a +" and Value of b " + b);

	}

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		System.out.println("Reverse the String is " + reverseString.reverseString("This is technocredits"));
		String[] input = { "Credits", "Techno", "From", "Diwali", "Happy" };
		System.out.println("Reverse Array String is " + Arrays.toString(reverseString.reverseStringArray(input)));
		reverseString.swapNousing3Var(10, 70);
		reverseString.swapNowithout3rdvar(30, 90);

	}

}
