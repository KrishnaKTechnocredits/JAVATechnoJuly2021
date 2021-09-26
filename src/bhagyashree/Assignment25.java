/*
 * Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4

Program2:
String str = "Ma1U2liK"
output : MUK12ali

*/
package bhagyashree;

public class Assignment25 {
	int getSumOfDigits(String input) {
		String temp = "";
		int sum = 0;

		for (int index = 0; index < input.length(); index++) {

			char ch = input.charAt(index);

			if (Character.isDigit(ch)) {
				temp += ch;
			} else {
				if (!temp.equals(""))
					sum += Integer.parseInt(temp);
				temp = "";
			}

		}
		return sum;
	}

	String getString(String input) {
		String upper = "";
		String lower = "";
		String digits = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				upper += ch;
			}
			if (Character.isLowerCase(ch)) {
				lower += ch;
			}
			if (Character.isDigit(ch)) {
				digits += ch;
			}
		}
		return upper + digits + lower;
	}

	public static void main(String[] args) {
		Assignment25 assignment25 = new Assignment25();
		System.out.println(
				"Sum of total digits in a given string: " + assignment25.getSumOfDigits("te12ch33no3credit4s"));

		System.out.println("Required String is: " + assignment25.getString("MUK12ali"));
	}
}
