package mratunjay.Assignment_29;

public class Assignment_29_PRG1 {

	String input = "naman";
	String output = "";

	void pallindromeCheckReverseMethod(String input) {

		for (int index = input.length() - 1; index >= 0; index--) {

			output += Character.toString(input.charAt(index));

		}

		if (input.equals(output))
			System.out.println("Entered string is Pallindrome: " + input);

		else
			System.out.println("Entered string is Not Pallindrome: " + input);
	}

	public static void main(String[] args) {

		Assignment_29_PRG1 A_29 = new Assignment_29_PRG1();
		A_29.pallindromeCheckReverseMethod(A_29.input);

	}

}