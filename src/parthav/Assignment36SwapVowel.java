/*Assignment 36: 22nd Sep 2021

WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.

input : "good morning"
output: "giod mornong"

input : "amol"
output: "omal"

input : "haorseuih"
output: "hiurseoah"*/

package parthav;

public class Assignment36SwapVowel {

	void swapVowel(String str) {
		String swappedString = "";
		String str1 = str.replaceAll("[^aeiou]", "");
		int swappedCount = str1.length();
		int index = 0;
		int swappedIndex = 1;
		for (; index < str.length(); index++) {
			if (checkVowelPresence(str.charAt(index))) {
				swappedString += str1.charAt(swappedCount - swappedIndex);
				swappedIndex++;
			} else {
				swappedString += str.charAt(index);
			}

		}

		System.out.println(swappedString);

	}

	boolean checkVowelPresence(char ch) {

		ch = Character.toUpperCase(ch);
		boolean isVowel = false;

		switch (ch) {
		case 'A':
			isVowel = true;
			break;
		case 'E':
			isVowel = true;
			break;
		case 'I':
			isVowel = true;
			break;
		case 'O':
			isVowel = true;
			break;
		case 'U':
			isVowel = true;
			break;
		default:
			isVowel = false;
			break;
		}
		return isVowel;

	}

	public static void main(String[] args) {

		String str1 = "good morning";
		Assignment36SwapVowel newObject = new Assignment36SwapVowel();
		newObject.swapVowel(str1);
		str1 = "amol";
		newObject.swapVowel(str1);
		str1 = "haorseuih";
		newObject.swapVowel(str1);

	}

}
