package nasir_Assignment_20;

public class FrequencyOfCharacter {
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
		FrequencyOfCharacter frequencyOfCharacter = new FrequencyOfCharacter();
		frequencyOfCharacter.getWord("technocredits", 'e');

	}

}
