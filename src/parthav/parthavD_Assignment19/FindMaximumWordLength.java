package parthav.parthavD_Assignment19;

public class FindMaximumWordLength {

	void findBiggestWord(String str) {
		String[] strArray = str.split(" ");
		String biggestString = "";
		for (int index = 0; index < strArray.length; index++) {
			if (biggestString.length() < strArray[index].length()) {
				biggestString = strArray[index];
			}
		}

		System.out.println(biggestString);
	}

}
