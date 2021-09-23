/*Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.

Example:
Input: Welcome to the family
Output: family*/

package astha.Assignment37;

public class Assignment37 {

	String get2ndHighestWord(String input) {
		String[] inputArray = input.split(" ");
		String highestWord = inputArray[0];
		String secondHighestWord = inputArray[1];
		for (int index = 2; index < inputArray.length; index++) {
			if (inputArray[index].length() > highestWord.length()) {
				secondHighestWord = highestWord;
				highestWord = inputArray[index];
			} else if (inputArray[index].length() > secondHighestWord.length())
				secondHighestWord = inputArray[index];
		}
		return secondHighestWord;
	}

	public static void main(String[] args) {
		Assignment37 assignment37 = new Assignment37();
		System.out.println("The second highest word in the input string is : " +assignment37.get2ndHighestWord("Welcome to the family"));
	}
}
