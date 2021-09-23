package monali.Assignment_36;
/*Assignment 36: 22nd Sep 2021
WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.
input : "good morning"
output: "giod mornong"
input : "amol"
output: "omal"
input : "haorseuih"
output: "hiurseoah"*/

public class SwapVowelsPoition {

	static void swapVowels(String str) {
		String vowels = "";
		String output = "";

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels += ch;
			}
		}
		// System.out.println(vowels);

		int adjustIndex = vowels.length() - 1;

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output += vowels.charAt(adjustIndex);
				adjustIndex--;
			} else
				output += ch;
		}

		System.out.println(str + "--> " + output);

	}

	public static void main(String[] args) {
		System.out.println("String after swapping vowels position : ");
		String input = "good morning";
		String input2 = "amol";
		String input3 = "haorseuih";

		swapVowels(input);
		swapVowels(input2);
		swapVowels(input3);
	}
}
