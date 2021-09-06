package siddharth;

public class Assignment20_3 {
	int getWord(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}

		}
		System.out.println("In word " + input + ", freq of " + ch + ":" + count);
		return count;

	}

	public static void main(String[] args) {
		Assignment20_3 frequencyOfCharacter = new Assignment20_3();
		frequencyOfCharacter.getWord("technocredits", 'e');

	}
}
