/*
 WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.

input : "good morning"
output: "giod mornong"

input : "amol"
output: "omal"

input : "haorseuih"
output: "hiurseoah"
 */
package umakant;

public class Assignment36 {
	// assuming provide string is in lowerCase
	String swapVowelsPosition(String input) {
		String output = "";
		String vowels = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				vowels += ch;
		}
		int innerIndex = vowels.length() - 1;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				output += vowels.charAt(innerIndex--);
			else
				output += ch;
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment36 assignment = new Assignment36();
		System.out.println(assignment.swapVowelsPosition("good morning"));
		System.out.println(assignment.swapVowelsPosition("amol"));
		System.out.println(assignment.swapVowelsPosition("haorseuih"));
	}

}
