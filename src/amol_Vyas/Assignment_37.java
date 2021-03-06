/*Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.

Example:
Input: Welcome to the family
Output: family*/

package amol_Vyas;

import java.util.Arrays;

public class Assignment_37 {

	static String getSecondHighestElementFromString(String input) {
		String[] output = input.split(" ");
		String maxWord = "", secondMax = "";
		for (int index = 0; index < output.length; index++) {
			if (output[index].length() > maxWord.length()) {
				secondMax = maxWord;
				maxWord = output[index];
			} else if (output[index].length() > secondMax.length())
				secondMax = output[index];
		}
		return secondMax;
	}

	public static void main(String[] args) {
		String input = "Welcome to the family";
		System.out
				.println("Second Highest element from the given String is " + getSecondHighestElementFromString(input));
	}
}
