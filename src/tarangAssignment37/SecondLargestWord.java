package tarangAssignment37;

/*Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.

Example:
Input: Welcome to the family
Output: family*/
public class SecondLargestWord {

	static String getSecondLargestWord(String input) {
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
		System.out.println("Second Highest element from the given String is = " + getSecondLargestWord(input));
	}

}
