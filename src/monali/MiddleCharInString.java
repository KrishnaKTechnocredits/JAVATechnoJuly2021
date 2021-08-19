package monali;

public class MiddleCharInString {
	char[] getMiddleCharInString(String[] str) {
		int count = 0;
		char[] output = new char[3];
		for (int index = 0; index < str.length; index++) {
			count = str[index].length() / 2;
			output[index] = str[index].charAt(count);
		}
		return output;
	}

	public static void main(String[] args) {
		MiddleCharInString middleCharEvenOdd = new MiddleCharInString();
		String[] str = { "hello", "techno", "credits" };
		System.out.println(middleCharEvenOdd.getMiddleCharInString(str));
	}
}
