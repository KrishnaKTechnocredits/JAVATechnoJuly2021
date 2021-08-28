//Assignment 22. Just as a practice, trying this program without using any pre-defined Character class methods

package parthav.parthavD_Assignment22;

public class CharacterOperationsWithoutCharacterFunctions {

	int getDigitCountInString(String inputStr) {
		int digitCount = 0;
		int chInt = ' ';

		for (int index = 0; index < inputStr.length(); index++) {
			chInt = inputStr.charAt(index);
			if (chInt >= (int) '0' && chInt <= (int) '9') {
				digitCount++;
			}

		}
		return digitCount;
	}

	public static void main(String[] args) {
		String inputStr = "Te1ch2no3cr4ed3it4s";
		CharacterOperationsWithoutCharacterFunctions newObject = new CharacterOperationsWithoutCharacterFunctions();
		System.out.println(
				"The total digits in the string: " + inputStr + " is " + newObject.getDigitCountInString(inputStr));

	}

}
