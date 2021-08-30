/*
  
 Assignment 25 : 29th Aug'2021

Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4

Program2:
String str = "Ma1U2liK"
output : MUK12ali 
 
 */
package sayli_Vyavhare;

public class SumOfNumInString_assignment_25 {

	int getSumOfNumbers(String str1) {
		int sum = 0;
		String str = "";

		for (int index = 0; index < str1.length(); index++) {
			if (Character.isDigit(str1.charAt(index))) {
				str = str + str1.charAt(index);
			} else {
				if (!str.equals("")) {
					sum = sum + Integer.parseInt(str);
					str = "";
				}
			}
		}
		return sum;

	}

	String upperCaseLetter(String str) {
		String upperCase = "", lowerCase = "", digit = "";
		for (int index = 0; index < str.length(); index++) {

			if (Character.isUpperCase(str.charAt(index))) {
				upperCase = upperCase + str.charAt(index);
			}
			if (Character.isDigit(str.charAt(index))) {
				digit = digit + str.charAt(index);

			}
			if (Character.isLowerCase(str.charAt(index))) {
				lowerCase = lowerCase + str.charAt(index);
			}
		}
		return upperCase + digit + lowerCase;
	}

	public static void main(String[] args) {
		SumOfNumInString_assignment_25 a= new SumOfNumInString_assignment_25();
		System.out.println("----------------------Program 1-------------------------");

		String input = "te12ch33no3credit4s";
		System.out.println("Sum of numbers in string " + input + " is " + a.getSumOfNumbers(input));
		System.out.println("----------------------Program 2-------------------------");
		System.out.println("Converted String is " + a.upperCaseLetter("Ma1U2liK"));

	}
}
