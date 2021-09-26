/*
		Assignment - 24 : 28th Aug'2021
		Program 1: Java Program to Count the Number of Vowels in user defined string.
		Input : technocredits
		output : vowels are e , o, i 

		Program 2 : Max repeating word with its freq.
		input : Hi Hello Hi Techno Hello Hi
		output : Hi -> 3*/
package sayli_Vyavhare;

public class Max_RepeatingWordIn_String_Assign_24 {

	void getVowelsInString(String input) {
		String vowel = " ";
		for (int index = 0; index < input.length(); index++) {
			char letter = input.charAt(index);

			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
				if (index == input.indexOf(letter)) {
					if (vowel != "")
						vowel += letter + ",";
				}
			}
		}

		System.out.println("Vowels in string " + input + " are:" + vowel);
	}

	void getRepeatingWord(String input) {
		int maxCount = 0;
		int count = 0, index = 0;
		String maxString = "";
		String[] str = input.split(" ");
		for (index = 0; index < str.length; index++) {
			for (int innerindex = 0; innerindex < str.length; innerindex++) {
				if (str[index].equals(str[innerindex])) {
					maxCount++;
				}
			}
			if (maxCount > count) {
				count = maxCount;
				maxString = str[index];
			}
			maxCount = 0;
		}
		System.out.println("Highest frequency is of " + maxString + " with count -> " + count);
	}

	public static void main(String[] args) {
		Max_RepeatingWordIn_String_Assign_24 max = new Max_RepeatingWordIn_String_Assign_24();
		// max.getMaxRepeatingWord("hi");
		String input = "Hello Hello Hi Techno Hello Hi";

		max.getRepeatingWord(input);
		String input1 = "technocredits";

		max.getVowelsInString(input1);
	}

}
