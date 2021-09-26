package mratunjay.Assignment_26;

public class Assignment_26 {

	String output = "";

	void printReverseGivenString(String str) {

		System.out.println("Input String:    "+str);
		
		for (int index = str.length() - 1; index >= 0; index--) {

			output += Character.toString(str.charAt(index));
		}

		System.out.println("Reverse String:  "+output);
	}

	void getArrayStringReverse(String[] str1) {

		System.out.println("input array string: ");

		for (int index = 0; str1.length > index; index++) {

			System.out.print(" " + str1[index]);

		}
		System.out.println();

		System.out.println("reverse array string: ");

		for (int index = str1.length - 1; index >= 0; index--) {

			System.out.print(" " + str1[index]);

		}
		System.out.println();
	}

	void swapNumbersUsing3rdVariable(int a, int b) {
		int c = 0;
		System.out.println("Before swapping: " + "Int A :  " + a + " Int B: " + b);

		c = a;
		a = b;
		b = c;

		System.out.println("After swapping:  " + "Int A :  " + a + " Int B: " + b);

	}

	void swapNumbersUsingTwoVaribles(int a, int b) {

		System.out.println("Before swaping: " + "Int A :  " + a + " Int B: " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swaping:  " + "Int A :  " + a + " Int B: " + b);

	}

	public static void main(String[] args) {
		String input = "This is technocredis";		
		Assignment_26 A_26 = new Assignment_26();
		
		String[] str1 = { "Credits", "Techno", "From", "Diwali", "Happy" };
		A_26.printReverseGivenString(input);
		System.out.println();
		A_26.getArrayStringReverse(str1);
		System.out.println();
		A_26.swapNumbersUsing3rdVariable(10, 20);
		System.out.println();
		System.out.println("Swaping without third variable");	
		System.out.println();
		A_26.swapNumbersUsingTwoVaribles(10, 20);
	}

}
