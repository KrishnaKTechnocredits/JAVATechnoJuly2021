package suruchi.Assignment37;

public class Program_A37 {

	void findSecondLargestWord(String str) {
		String maxSecondWord = "";
		int maxLength = 0;
		int maxSecondLength = 0;
		String[] strArr = str.split(" ");
		for (int index = 0; index < strArr.length; index++) {
			int wordLength = strArr[index].length();
			if (maxLength < wordLength) {
				maxLength = wordLength;
			} else if (maxLength != wordLength && maxSecondLength < wordLength) {
				maxSecondWord = strArr[index];
				maxSecondLength = wordLength;
			}
		}
		System.out.println("Second largest word in the string '" + str + "' is : '" + maxSecondWord + "'");
	}

	public static void main(String[] args) {
		Program_A37 program_a37 = new Program_A37();

		program_a37.findSecondLargestWord("Welcome to the family");
	}
}