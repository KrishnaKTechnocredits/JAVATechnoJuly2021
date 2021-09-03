/*
 * Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3
 */
package mayur_Assignment24;

public class Assignment24_2 {

	private int getWordsCountFromString(String input, String word) {
		int count = 0;
		String[] str = input.split(" ");
		for (int index = 0; index < str.length; index++) {
			if (word.equalsIgnoreCase(str[index]))
				count++;
		}
		return count;
	}

	void getMaxRepititveWordCount(String input) {
		int maxCount = 0;
		String word = "";
		String[] str = input.split(" ");
		for (int index = 0; index < str.length; index++) {
			if (getWordsCountFromString(input, str[index]) > maxCount) {
				maxCount = getWordsCountFromString(input, str[index]);
				word = str[index];
			}
		}
		System.out.println("Maximum Repitive Word is " + word + " and it is coming " + maxCount + " times");
	}

	public static void main(String[] args) {
		String input1 = "Hi Hello Hi Techno Hello Hi";
		Assignment24_2 assignment24_2 = new Assignment24_2();
		assignment24_2.getMaxRepititveWordCount(input1);

	}

}
