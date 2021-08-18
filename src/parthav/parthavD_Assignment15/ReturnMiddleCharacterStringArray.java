package parthav.parthavD_Assignment15;

public class ReturnMiddleCharacterStringArray {
	String[] inputStringArr = new String[3];

	void setStringArray(String[] arr) {
		inputStringArr = arr;
	}

	void getMiddleCharacterInString() {
		for (int index = 0; index < inputStringArr.length; index++) {
			System.out.println("The middle character of string no: " + (index + 1) + " in the array is");
			if (inputStringArr[index].length() % 2 != 0) {
				System.out.println(charAt(inputStringArr[index].length(), inputStringArr[index]));
			}

			else
				System.out.println(charAt(inputStringArr[index].length() - 1, inputStringArr[index]));
		}
	}

	char charAt(int index, String str) {
		return str.charAt(index / 2);
	}

}
