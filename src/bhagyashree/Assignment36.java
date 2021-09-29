/*
 * WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.

input : "good morning"
output: "giod mornong"

 */

package bhagyashree;

public class Assignment36 {

	String getVowels(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == 'a' || input.charAt(index) == 'e' || input.charAt(index) == 'i'
					|| input.charAt(index) == 'o' || input.charAt(index) == 'u') {
				output += input.charAt(index);
			}
		}
		return output;
	}

	String swapVowels(String input)// amol
	{
		String output = "";
		String vowelString = getVowels(input);// ao
		int vowelCnt = vowelString.length();// 2
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == 'a' || input.charAt(index) == 'e' || input.charAt(index) == 'i'
					|| input.charAt(index) == 'o' || input.charAt(index) == 'u') {
				count++;// 1 2
				output += vowelString.charAt(vowelCnt - count);

			} else
				output += input.charAt(index);
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment36 ass36 = new Assignment36();
		System.out.println(ass36.swapVowels("amol"));
	}

}
