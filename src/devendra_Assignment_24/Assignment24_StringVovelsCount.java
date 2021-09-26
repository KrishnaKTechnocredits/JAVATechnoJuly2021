/*Assignment - 24 : 28th Aug'2021
Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i 

Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3*/

package devendra_Assignment_24;

public class Assignment24_StringVovelsCount {
	int getStringVowelsCount(String input) {
		int count = 0;
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			if (index == input.indexOf(input.charAt(index))) {
				if (input.charAt(index) == 'a' || input.charAt(index) == 'e' || input.charAt(index) == 'i' || input.charAt(index) == 'o' || input.charAt(index) == 'u') {
					output += String.valueOf(input.charAt(index)) + " ";
					count++;
				}
			}
		}
		System.out.println("The Vowels in String = " + output);
		return count;
	}

	private int getStringWordsCount(String input, String word) {
		int count = 0;
		String[] str = input.split(" ");
		for (int index = 0; index < str.length; index++) {
			if (word.equalsIgnoreCase(str[index]))
				count++;
		}
		return count;
	}

	void getMaxRepeatWordCount(String input) {
		int maxCount = 0;
		String word = "";
		String[] str = input.split(" ");
		for (int index = 1; index < str.length -1; index++) {
			if (getStringWordsCount(input, str[index]) > maxCount) {
				maxCount = getStringWordsCount(input, str[index]);
				word = str[index];
			}
		}
		System.out.println("Max-Repeating Word = " + word + "\nFrequency = " + maxCount);
	}

	public static void main(String[] args) {
		String input1 = "technocredits";
		String input2 = " Hi Hello Hi Techno Hello Hi ";
		Assignment24_StringVovelsCount assign24_vovels = new Assignment24_StringVovelsCount();
		System.out.println("Count of Vowel in the string = " + assign24_vovels.getStringVowelsCount(input1) + "\n ---------------------");
		assign24_vovels.getMaxRepeatWordCount(input2);
	}
}
