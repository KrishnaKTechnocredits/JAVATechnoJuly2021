/*Assignment 19 [program 3 : Find minimum word length from given statement.] DATE: 08/20
input = "good morning technocredits hi hello";
output : hi*/
package basic.Assignment_19;

public class MinWordFromStatement {

	String[] getNumberOfWords(String input) {
		String[] arr = null;
		for (int index = 0; index < input.length() - 1; index++) {
			arr = input.split(" ");
		}
		return arr;
	}

	String wordWithMinLength(String input) {
		String minString = "";
		String[] arr = getNumberOfWords(input);
		int minLength = arr[0].length();
		for (int i = 0; i < arr.length; i++) {
			if (minLength > arr[i].length()) {
				minLength = arr[i].length();
				minString = arr[i];
			}
		}
		return minString;
	}

	public static void main(String[] args) {
		MinWordFromStatement input = new MinWordFromStatement();
		String minString = input.wordWithMinLength("good morning technocredits hi hello");
		System.out.println("Word with maximum length in the statement is: " + minString);
	}

}