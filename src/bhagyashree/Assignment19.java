package bhagyashree;

public class Assignment19 {

	/*
	 * program 1: Find how many words in a given statement. input =
	 * "Hi Techno Credits Hello" output : 4
	 * 
	 */
	int sum = 0;

	int getSumofWOrdsinGivenString(String input) {
		String[] arr = input.split(" ");
		return arr.length;
	}
	/*
	 * program 2: Find maximum word length from given statement. input =
	 * "good morning technocredits hi hello"; output : technocredits
	 * 
	 */

	String getMaxWord(String input) {
		String[] arr = input.split(" ");
		String output = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() > output.length()) {
				output = arr[index];
			}
		}
		return output;
	}

	/*
	 * program 3 : Find minimum word length from given statement. input =
	 * "good morning technocredits hi hello"; output : hi
	 * 
	 */

	String getMinWord(String input) {
		String[] arr = input.split(" ");
		String output = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() < output.length()) {
				output = arr[index];
			}
		}
		return output;
	}

	/*
	 * program 4: sum of all numbers in given statement. input = "10 10 20 30";
	 * output : 70
	 * 
	 */
	int getSumOfNumbersInString(String input) {
		int sum = 0;
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			sum += Integer.parseInt(arr[index]);
		}

		return sum;
	}

	public static void main(String[] args) {
		Assignment19 ass19 = new Assignment19();
		System.out
				.println("Total words in given string: " + ass19.getSumofWOrdsinGivenString("Hi Techno Credits Hello"));

		System.out.println(
				"Max length word in a given string is: " + ass19.getMaxWord("good morning technocredits hi hello"));

		System.out.println(
				"Min length word in a given string is: " + ass19.getMinWord("good morning technocredits hi hello"));

		System.out.println("Sum of Digits in given string is: " + ass19.getSumOfNumbersInString("10 10 20 40 10"));
	}
}
