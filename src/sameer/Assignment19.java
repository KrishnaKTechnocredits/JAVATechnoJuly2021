/*program 1: Find how many words in a given statement.
input = "Hi Techno Credits Hello"
output : 4
program 2: Find maximum word length from given statement.
input = "good morning technocredits hi hello";
output : technocredits
program 3 : Find minimum word length from given statement.
input = "good morning technocredits hi hello";
output : hi
program 4: sum of all numbers in given statement.
input = "10 10 20 30";
output : 70*/

package sameer;

public class Assignment19 {
	void getNumberOfWords(String input) {
		String arr[] = input.split(" ");
		System.out.println("Total number of words are: " + arr.length);
	}

	void getMaxWordLength(String input) {
		int temp = 0;
		String arr[] = input.split(" ");
		int index = 0;
		int stringLength = 0;
		String maxString = "";
		for (; index < arr.length; ++index) {
			stringLength = arr[index].length();
			if (temp < stringLength) {
				temp = stringLength;
				maxString = arr[index];
			}
		}
		System.out.println("Maximum String Length Of " + maxString + " Is " + temp);
	}

	void getMinWordLength(String input) {
		String arr[] = input.split(" ");
		int index = 0;
		int min = arr[0].length();
		String minString = arr[0];
		for (; index < arr.length; index++) {

			if (arr[index].length() < min) {
				min = arr[index].length();
				minString = arr[index];
			}
		}
		System.out.println("Minimum String Length Of " + minString + " Is " + min);
	}

	void getSumOfAllNumbers(String input) {
		int temp = 0;
		String[] str = input.split(" ");
		for (int index = 0; index < str.length; index++) {
			int num = Integer.valueOf(str[index]);
			temp = temp + num;
		}
		System.out.println("Sum of " + input + " is = " + temp);
	}

	public static void main(String[] args) {

		Assignment19 assignment19 = new Assignment19();
		String input = "Hi Techno Credits Hello";
		assignment19.getNumberOfWords(input);
		String word = "good morning technocredits hi hello";
		assignment19.getMaxWordLength(word);
		assignment19.getMinWordLength(word);
		String str = "10 10 20 30";
		assignment19.getSumOfAllNumbers(str);
	}

}
