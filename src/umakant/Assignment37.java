/*
 *Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.

Example:
Input: Welcome to the family
Output: family
 */
package umakant;

public class Assignment37 {

	String getSecondLargestWord(String input) {
		String[] words = input.split(" ");
		String maxLengthWord = "";
		String secondMaxLengthWord = "";
		for (int index = 0; index < words.length; index++) {
			if (words[index].length() > maxLengthWord.length()) {
				secondMaxLengthWord = maxLengthWord;
				maxLengthWord = words[index];
			} else if (words[index].length() > secondMaxLengthWord.length()
					&& words[index].length() != maxLengthWord.length()) {
				secondMaxLengthWord = words[index];
			}

		}
		return secondMaxLengthWord;
	}

	public static void main(String[] args) {
		System.out.println(new Assignment37().getSecondLargestWord("Welcome to the family"));
	}

}
