package neha;

/*WAP to find a second largest word.
Example:
Input: Welcome to the family
Output: family*/
public class SecondLargestWordAssignment37 {
	String findSecondLargestWord(String str) {
		String maxSecondWord = "";
		String maxLengthWord = "";
		int maxLength = 0;
		int maxSecondLength = 0;
		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			int wordLength = strArr[i].length();
			if (maxLength < wordLength) {
				maxLength = wordLength;
				maxLengthWord = strArr[i];
			} else if (maxSecondLength < wordLength) {
				maxSecondWord = strArr[i];
				maxSecondLength = wordLength;
			}
		}
		return maxSecondWord;
	}

	public static void main(String[] args) {
		SecondLargestWordAssignment37 secondLargestWord = new SecondLargestWordAssignment37();
		String input = "Welcome to the family";
		System.out.println("Second largest word in string \"" + input + "\" is \""
				+ secondLargestWord.findSecondLargestWord(input) + "\"");
	}
}
