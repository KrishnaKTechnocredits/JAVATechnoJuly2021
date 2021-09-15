//Program 2: Find first non repeating word from a given String. [expected : 15 mins]
/*input : hi this is techno gm credits this hi is 
output : techno*/

package parthav.parthavD_StringOperations_test6;

public class StringOperationsTest6Program2 {

	void printFirstNonRepeatingWordFromString(String input) {
		String[] inputArr = input.split(" ");
		String outputWord = getFirstNonRepeatingWord(inputArr);
		if (!outputWord.equals(""))
			System.out.println("The first non-repeating word from the given string is: " + outputWord);
		else
			System.out.println("There are no non-repeating words from the given string");
	}

	String getFirstNonRepeatingWord(String[] inputArr) {
		String nonRepeatingWord = "";
		int repeatCounter = 0;

		for (int index = 0; index < inputArr.length; index++) {
			nonRepeatingWord = inputArr[index];
			repeatCounter = 0;
			for (int innerIndex = 0; innerIndex < inputArr.length; innerIndex++) {
				if (nonRepeatingWord.equals(inputArr[innerIndex])) {
					repeatCounter++;
				}

			}

			if (repeatCounter == 1) {
				return nonRepeatingWord;
			}
		}

		return "";

	}

	public static void main(String[] args) {
		StringOperationsTest6Program2 newObject = new StringOperationsTest6Program2();
		String inputString = "hi this is techno gm credits this hi is";
		newObject.printFirstNonRepeatingWordFromString(inputString);

	}

}
