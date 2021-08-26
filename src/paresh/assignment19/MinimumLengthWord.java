package paresh.assignment19;

/*program 3 : Find minimum word length from given statement.
input = "good morning technocredits hi hello";
output : hi*/

public class MinimumLengthWord {

	String findMinimumWordLength(String str) {
		String newString = "";
		String[] arr = str.split(" ");
		int temp = arr[0].length();

		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() < temp) {
				temp = arr[index].length();
				newString = arr[index];
			}
		}
		return newString;
	}

	public static void main(String[] args) {
		MinimumLengthWord minimumLengthWord = new MinimumLengthWord();
		String str = "good morning technocredits hi hello";
		String minimumLength = minimumLengthWord.findMinimumWordLength(str);
		System.out.println("The smallest word in the given string is: " + minimumLength);
	}

}
