package monali;

public class MinimumWordLength {
	/*
	 * program 3 : Find minimum word length from given statement. input =
	 * "good morning technocredits hi hello"; output : hi
	 */

	String getMinWordLength(String input) {
		String[] str = input.split(" ");
		String minWordLength = str[1];
		for (int index = 0; index < str.length; index++) {
			if (str[index].length() < minWordLength.length())
				minWordLength = str[index];
		}
		return minWordLength;

	}

	public static void main(String[] args) {
		MinimumWordLength minWordLen = new MinimumWordLength();
		String input = "good morning technocredits hi hello";
		System.out.println(minWordLen.getMinWordLength(input));
	}
}
