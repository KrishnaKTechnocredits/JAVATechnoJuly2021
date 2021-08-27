package monali;

public class MaximumWordLength {

	/*
	 * program 2: Find maximum word length from given statement. input =
	 * "good morning technocredits hi hello"; output : technocredits
	 */

	void getMaxWordLength(String input) {
		String[] str = input.split(" ");
		String maxlenWord = str[1];
		for (int index = 0; index < str.length; index++) {
			if (str[index].length() > maxlenWord.length())
				maxlenWord = str[index];
		}
		System.out.println(maxlenWord);
	}

	public static void main(String[] args) {
		MaximumWordLength maxWordLen = new MaximumWordLength();
		String input = "good morning technocredits hi hello";
		maxWordLen.getMaxWordLength(input);
	}
}
