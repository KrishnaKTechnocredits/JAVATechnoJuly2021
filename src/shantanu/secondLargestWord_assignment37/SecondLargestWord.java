package shantanu.secondLargestWord_assignment37;

public class SecondLargestWord {
	String getSecondLargestWord(String str) {
		String strArray[] = str.split(" ");
		String maxWord = "";
		String secondMax = "";

		for (int index = 0; index < strArray.length; index++) {
			if (strArray[index].length() > maxWord.length()) {
				secondMax = maxWord;
				maxWord = strArray[index];
			} else if (strArray[index].length() > secondMax.length())
				secondMax = strArray[index];
		}

		return secondMax;
	}
	void displaySecondLargestWord(String str) {
		
		System.out.println("Second largest word is: "+getSecondLargestWord(str));
	}
	public static void main(String[] args) {
		SecondLargestWord secondLargestWord = new SecondLargestWord();
		String str = "Welcome to the family";
		secondLargestWord.displaySecondLargestWord(str);
	}
}
