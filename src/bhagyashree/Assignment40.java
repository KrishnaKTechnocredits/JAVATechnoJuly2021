/*
 * Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3

 */
package bhagyashree;

import java.util.Arrays;

public class Assignment40 {

	void printNumbersFromGivenString(String input) {
		int number = 0;
		String[] str = input.split(" ");
		// System.out.println(Arrays.toString(str));

		for (int index = 0; index < str.length; index++) {
			try {
				number = Integer.parseInt(str[index]);
				System.out.println(number);

			} catch (NumberFormatException ne) {

			}
		}

	}

	public static void main(String[] args) {
		Assignment40 ass40 = new Assignment40();
		ass40.printNumbersFromGivenString("I have 15 years and 3 months of exp");
	}

}
