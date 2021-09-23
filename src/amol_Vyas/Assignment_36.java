/*Assignment 36: 22nd Sep 2021

WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.

input : "good morning"
output: "giod mornong"

input : "amol"
output: "omal"

input : "haorseuih"
output: "hiurseoah"*/

package amol_Vyas;

public class Assignment_36 {

	String getVowelFromString(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == 'a' || input.charAt(index) == 'e' || input.charAt(index) == 'i'
					|| input.charAt(index) == 'o' || input.charAt(index) == 'u')
				output += input.charAt(index);
		}
		return output;
	}

	String getReplaceVowelPosition(String input) {
		String output = "";
		String vowelFromInput = getVowelFromString(input);
		int vowelCount = vowelFromInput.length();
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == 'a' || input.charAt(index) == 'e' || input.charAt(index) == 'i'
					|| input.charAt(index) == 'o' || input.charAt(index) == 'u') {
				count++;
				output += vowelFromInput.charAt(vowelCount - count);
			} else
				output += input.charAt(index);
		}
		return output;
	}

	public static void main(String[] args) {
		String input = "amol";
		Assignment_36 assignment_36 = new Assignment_36();
		System.out.println(
				"Swaping of vowel in string from last to first is " + assignment_36.getReplaceVowelPosition(input));
	}

}
