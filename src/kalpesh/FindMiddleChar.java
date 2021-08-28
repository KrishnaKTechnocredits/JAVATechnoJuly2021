package kalpesh;

public class FindMiddleChar {
	char findMiddleChar(String str) {

		char[] character = new char[str.length()];
		int no = 0;
		int charIndex = 0;

		for (int index = 0; index < str.length(); index++) {
			if (str.length() % 2 == 0) {
				no = str.length() / 2 - 1;
				character[charIndex] = str.charAt(no);
			} else {
				no = str.length() / 2;
				character[charIndex] = str.charAt(no);
			}
		}
		return character[charIndex];
	}

	void takeStringArray(String[] str) {

		for (int index = 0; index < str.length; index++) {
			char ch = findMiddleChar(str[index]);
			System.out.println("Middle Character of " + str[index] + " is " + ch);
		}
	}

	public static void main(String[] args) {
		String[] str = { "hello", "techno", "credits" };
		FindMiddleChar findchar = new FindMiddleChar();
		findchar.takeStringArray(str);
	}
}

/*
 * program 2 : return middle char of all elements of the String array. String[]
 * str = {"hello","techno","credits"}; char charAt(int index){ } Hint : charAt
 * method of String class helps to retrieve character on given index
 */