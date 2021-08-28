/*
 * Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
output : 13
 */

package mayur;

public class Assignment22_1 {

	void sumAllDigitInString(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of all digit in a given String is : " + sum);

	}

	public static void main(String[] args) {

		Assignment22_1 assignment22_1 = new Assignment22_1();
		String str = "Te11ch2no3cr4edi2ts";
		assignment22_1.sumAllDigitInString(str);

	}

}
