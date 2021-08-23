/*//Assignment 19 [program 2: Find maximum word length from given statement.] DATE: 08/20
input = "good morning technocredits hi hello";
output : technocredits*/
package deepak.Assignment_19;

public class MaxWordFromStatement {
	String[] getNumberOfWords(String input) {
		String[] arr = null;
		for (int index = 0; index < input.length() - 1; index++) {
			arr = input.split(" ");
		}
		return arr;
	}

	String wordWithmaxLength(String input) {
		int maxLength = 0;
		String maxString = "";
		String[] arr = getNumberOfWords(input);
		for (int i = 0; i < arr.length; i++) {
			if (maxLength < arr[i].length()) {
				maxLength = arr[i].length();
				maxString = arr[i];
			}
		}
		return maxString;
	}

	public static void main(String[] args) {
		MaxWordFromStatement input = new MaxWordFromStatement();
		String maxString = input.wordWithmaxLength("good morning technocredits hi hello");
		System.out.println("Word with maximum length in the statement is: " + maxString);
	}

}
