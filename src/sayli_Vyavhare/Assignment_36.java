/*Assignment 36: 22nd Sep 2021
WAP to swap vowel in String mean last first vowel should replace first vowel in String 
and vice verse.
input : "good morning" output: "giod morning”
input : "amol" output: "omal"
input : "haorseuih" output: "hiurseoah"
 */
package sayli_Vyavhare;

public class Assignment_36 {
	static String getVowels(String input) {
		char ch;
		String vowels = "", vowelsRev = "";
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				vowels += ch;
		}
		for (int index = vowels.length() - 1; index >= 0; index--) {
			vowelsRev += vowels.charAt(index);
		}
		return vowelsRev;
	}

	static String swapVowels(String input) {
		char ch;
		String output = "", vowels = getVowels(input);
		int vowelIndex = 0;
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output += vowels.charAt(vowelIndex);
				vowelIndex++;
			} else
				output += ch;
		}
		return output;
	}

	public static void main(String[] args) {

		String str1 = "google";
		String str2 = "ariv";

		System.out.println("Input: " + str1 + "  output: " + swapVowels(str1));
		System.out.println("Input: " + str2 + "  output: " + swapVowels(str2));

	}
}
