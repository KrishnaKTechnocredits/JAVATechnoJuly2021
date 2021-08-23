//Assignment 19 [Program 1 - Find how many words in a given statement.] DATE: 08/20
package basic.Assignment_19;

public class NumberOfWords {
	String[] getNumberOfWords(String input) {
		String[] arr = null;
		for (int index = 0; index < input.length() - 1; index++) {
			arr = input.split(" ");
		}
		return arr;
	}

	public static void main(String[] args) {

		NumberOfWords input = new NumberOfWords();
		String[] arr = input.getNumberOfWords("Hi Techno Credits Hello");
		System.out.print("Number of words in the statement is: ");
		System.out.println(arr.length);
	}
}
