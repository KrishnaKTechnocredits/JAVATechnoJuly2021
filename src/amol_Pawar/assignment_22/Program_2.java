package amol_Pawar.assignment_22;

public class Program_2 {
	void getSumOfDigits(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {

			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of digits in given string "+input+" : "+sum);
	}

	public static void main(String[] args) {
		Program_2 program_2 = new Program_2();
		String str = "Te11ch2no3cr4edi2ts";
		program_2.getSumOfDigits(str);
	}
}
/*
 * Program 2 : Find sum of all the digits in a given string String str =
 * "Te11ch2no3cr4edi2ts" output : 13
 */