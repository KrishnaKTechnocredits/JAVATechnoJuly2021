/*Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.

Example:
Input: Welcome to the family
Output: family*/

package deepak.assignment_37;

public class MaxSecondWord {

	public String secondLargestWord(String str) {
		String[] strArray = str.split(" ");
		String maxWord = "";
		String maxSecondWord = "";

		for (int index = 0; index < strArray.length; index++) {
			if (strArray[index].length() > maxWord.length()) {
				maxSecondWord = maxWord;
				maxWord = strArray[index];
			} else if (strArray[index].length() > maxSecondWord.length()) {
				maxSecondWord = strArray[index];
			}

		}
		return maxSecondWord;

	}

	public static void main(String[] args) {
		MaxSecondWord obj = new MaxSecondWord();
		String output = obj.secondLargestWord("Welcome to the family");
		System.out.println("Second Largest word in length is: " + output);
	}

}
