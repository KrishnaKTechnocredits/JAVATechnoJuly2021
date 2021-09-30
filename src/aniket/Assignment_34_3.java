package aniket;

public class Assignment_34_3 {

	void findNonrepeatedVowel(String str) {
		char vowelChar = ' ';

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int count = 0;
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

				if (str.indexOf(ch) == str.lastIndexOf(ch)) {
					vowelChar = ch;
					count++;
				}
			}

			if (count == 1)
				break;
		}
		System.out.println("First non repeating vowel character from given string is : " + vowelChar);
	}

	public static void main(String[] args) {
		String input = "aeapquawrpti";
		new Assignment_34_3().findNonrepeatedVowel(input);
	}
}
