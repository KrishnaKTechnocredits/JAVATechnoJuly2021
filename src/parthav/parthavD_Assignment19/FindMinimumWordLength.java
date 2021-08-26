package parthav.parthavD_Assignment19;

public class FindMinimumWordLength {

	void findSmallestWord(String str) {
		String[] strArray = str.split(" ");
		String smallestString = strArray[0];
		for (int index = 0; index < strArray.length; index++) {
			if (smallestString.length() > strArray[index].length()) {
				smallestString = strArray[index];
			}
		}

		System.out.println(smallestString);
	}

}
