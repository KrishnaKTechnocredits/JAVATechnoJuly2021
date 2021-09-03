/* Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i */
package astha.Assignment24;

public class VowelCount {

	void countOfVowel(String userInput) {
		String input = userInput.toLowerCase();
		for (int index = 0; index < input.length(); index++) {
			if ((input.charAt(index) == 'a') || (input.charAt(index) == 'e') || (input.charAt(index) == 'i')
					|| (input.charAt(index) == 'o') || (input.charAt(index) == 'u')) {
				if (index == input.indexOf(input.charAt(index)))
					System.out.println(input.charAt(index));
			}

		}
	}

	public static void main(String[] args) {
		VowelCount vowelCount = new VowelCount();
		System.out.println("Vowels in the input String are : ");
		vowelCount.countOfVowel("tEchnOcredits");
	}

}
