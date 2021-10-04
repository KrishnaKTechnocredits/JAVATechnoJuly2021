package rushikesh.assign36_39;
/*
Assignment 36: 22nd Sep 2021
WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.
input : "good morning"
output: "giod mornong"

input : "amol"
output: "omal"

input : "haorseuih"
output: "hiurseoah"
 */
public class Assign36 {
	String getStringBySwappingVowels(String input) {
		String outputVowvel = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				outputVowvel += ch;
			}
		}
		String outputRevVowel = "";
		for (int index = outputVowvel.length() - 1; index >= 0; index--) {
			char ch = outputVowvel.charAt(index);
			outputRevVowel += ch;
		}
		return outputRevVowel;
	}

	String swapVowel(String input) {
		char ch;
		String output = "", vowels = getStringBySwappingVowels(input);
		int vowelsIndex = 0;
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output += vowels.charAt(vowelsIndex);
				vowelsIndex++;
			} else
				output += ch;
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "haorseuih";
		String input1 ="good morning";
		Assign36 assign36 = new Assign36();
		String output = assign36.swapVowel(input);
		String output1 = assign36.swapVowel(input1);
		System.out.println("String input is "+input+" and output is "+output);
		System.out.println("String input is "+input1+" and output is "+output1);
	}
}