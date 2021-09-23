/*Assignment 36: 22nd Sep 2021

WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.

input : "good morning"
output: "giod mornong"

input : "amol"
output: "omal"

input : "haorseuih"
output: "hiurseoah"*/
package shalaka.Assignment36;

public class SwappingVowels {
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
		String input = "amol";
		String input1 ="good morning";
		SwappingVowels swappingVowels = new SwappingVowels();
		String output = swappingVowels.swapVowel(input);
		String output1 = swappingVowels.swapVowel(input1);
		System.out.println("String input is "+input+" and String output is "+output);
		System.out.println("String input is "+input1+" and String output is "+output1);
	}
}
