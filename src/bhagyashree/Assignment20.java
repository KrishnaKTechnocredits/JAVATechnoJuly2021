package bhagyashree;

public class Assignment20 {
	/*
	 * Program 1: find frequency of given character from user defined string. use
	 * scanner class to take word and character from user. input : word ->
	 * technocredits ch -> e output : e -> 2
	 * 
	 */
	int getFrequencyOfCharacterFromGivenString(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}

		System.out.println("Frequency of Character " + ch + " from word  " + input + " is: " + count);
		return count;
	}

	/*
	 * program 2: Find frequency of each character from user defined string. input :
	 * word -> hello output : h -> 1 e -> 1 l -> 2 o -> 1
	 * 
	 */
	void printFrequencyOfEveryWordInString(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (index == input.indexOf(input.charAt(index)))
				getFrequencyOfCharacterFromGivenString(input, input.charAt(index));
		}
	}

	/*
	 * program 3: print unique characters from user defined string. input : word ->
	 * aakanksha output : n s h
	 * 
	 */

	void getUniqueChar(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == ch)
					count++;
			}
			if (count == 1) {
				System.out.println(ch);
			}

		}
	}

	void getFreqOfUniqueCharFromString(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index)))
				getFrequencyOfCharacterFromGivenString(input, input.charAt(index));
		}
	}

	/*
	 * program 4 : print duplicate characters with their frequency from user defined
	 * string. input : word -> aakanksha output : a -> 4 k -> 2 n -> 1 s -> 1 h -> 1
	 * 
	 */
	void getDuplicateCharFromString(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.lastIndexOf(input.charAt(index)) > input.indexOf(input.charAt(index))) {
				if (index == input.indexOf(input.charAt(index)))
					getFrequencyOfCharacterFromGivenString(input, input.charAt(index));
			}
		}
	}

	public static void main(String[] args) {
		Assignment20 ass20 = new Assignment20();
		 ass20.getFrequencyOfCharacterFromGivenString("Technocredits", 'e');
		 System.out.println("--------------------------------------------------------");

		ass20.printFrequencyOfEveryWordInString("technocredits");
		System.out.println("--------------------------------------------------------");

		ass20.getUniqueChar("bhagyashreee");
		System.out.println("--------------------------------------------------------");

		ass20.getFreqOfUniqueCharFromString("bhagyashree");
		System.out.println("--------------------------------------------------------");

		ass20.getDuplicateCharFromString("bhagyashree");
		System.out.println("--------------------------------------------------------");
	}

}
