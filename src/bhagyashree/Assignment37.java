package bhagyashree;

/*
 * WAP to find a second largest word.

Example:
Input: Welcome to the family
Output: family

 */

public class Assignment37 {

	void getSeconHighestLengthWord(String input) {
		String[] arr = input.split(" ");
		String firstHigest = arr[0];
		String secondHighest = arr[1];/// welcome to the family

		for (int index = 2; index < arr.length; index++) {
			if (arr[index].length() > firstHigest.length()) {
				secondHighest = firstHigest;
				firstHigest = arr[index];
			} else if (arr[index].length() > secondHighest.length()) {
				secondHighest = arr[index];
			}
		}
		System.out.println("Second Highest length word from given string is: " + secondHighest);
	}

	public static void main(String[] args) {
		Assignment37 ass37 = new Assignment37();
		ass37.getSeconHighestLengthWord("Welcome11 to the family emoclew11");
	}
}
