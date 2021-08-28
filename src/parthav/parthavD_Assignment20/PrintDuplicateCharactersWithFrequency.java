package parthav.parthavD_Assignment20;

public class PrintDuplicateCharactersWithFrequency {

	void printDuplicateCharacters(String inputStr) {
		
		System.out.println("Duplicate characters in string " + inputStr + " are: ");

		for (int index = 0; index < inputStr.length(); index++) {
			char ch = inputStr.charAt(index);
			int duplicateCount = 0;
			boolean duplicateFlag = false;
			if (inputStr.indexOf(ch) != inputStr.lastIndexOf(ch))
				duplicateFlag = true;
			duplicateCount = getFrequencyOfDuplicateCharacters(inputStr, ch);

			if (duplicateFlag && (index == inputStr.indexOf(ch)))
				System.out.println(ch + " --> " + duplicateCount);

		}
	}

	int getFrequencyOfDuplicateCharacters(String inputStr, char ch) {
		int frequencyOfCharacters = 0;
		for (int innerIndex = 0; innerIndex < inputStr.length(); innerIndex++) {
			if (ch == inputStr.charAt(innerIndex))
				frequencyOfCharacters++;
		}

		return frequencyOfCharacters;

	}

}
