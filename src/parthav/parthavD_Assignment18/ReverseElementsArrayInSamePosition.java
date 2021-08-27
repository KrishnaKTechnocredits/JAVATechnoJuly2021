package parthav.parthavD_Assignment18;

public class ReverseElementsArrayInSamePosition {

	String getReverseString(String str) {
		String outputString = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			outputString += str.charAt(index);
		}

		return outputString;
	}

	String[] getReversedArray(String[] strArray) {
		for (int index = 0; index <= strArray.length - 1; index++) {
			strArray[index] = getReverseString(strArray[index]);
		}

		return strArray;
	}

}
