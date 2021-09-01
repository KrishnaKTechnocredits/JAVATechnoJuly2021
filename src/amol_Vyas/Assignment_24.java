/*Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i 

Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3*/

package amol_Vyas;

public class Assignment_24 {

	int getVowelsCountFromString(String input) {
		int count = 0;
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			if (index == input.indexOf(input.charAt(index))) {
				if (input.charAt(index) == 'a' || input.charAt(index) == 'e' || input.charAt(index) == 'i'
						|| input.charAt(index) == 'o' || input.charAt(index) == 'u') {
					output += String.valueOf(input.charAt(index)) + " ";
					count++;
				}
			}
		}
		System.out.println("The vowels are in the string is " + output);
		return count;
	}

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
		String input = "technocredits";
		String input1 = "Hi Hello Hi Techno Hello Hi";
		Assignment_24 assignment_24 = new Assignment_24();
		System.out.println("Count of vowel in the string is " + assignment_24.getVowelsCountFromString(input));
		assignment_24.getMaxRepititveWordCount(input1);
	}

}
