/*
 * Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.

Example:
Input: Welcome to the family
Output: family
 */

package husain.Assignment37;

public class FindWord {

	String secondMaxLength(String str) {

		String arr[] = str.split(" ");
		String maxWord = "";
		String secondMax = "";

		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() > maxWord.length()) {
				secondMax = maxWord;
				maxWord = arr[index];
			} else if (arr[index].length() > secondMax.length())
				secondMax = arr[index];
		}

		return secondMax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindWord word = new FindWord();
		String str = "Welcome to the family";
		System.out.println("The second largest word in the given string \"" + str + "\" is " + word.secondMaxLength(str));

	}

}
