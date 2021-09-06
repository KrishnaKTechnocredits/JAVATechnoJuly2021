package siddharth;

public class Assignment20_4 {
	int getWord(String input, char ch) {
		int count = 0;
		for (int index = 0; index <input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}

		}
		System.out.println("In word " + input + ", freq of " + ch + ":" + count);
		return count;

	}
	void uniqueChar(String input) {
		for(int index=0;index<input.length();index++) {
			if(input.lastIndexOf(input.charAt(index)) == input.indexOf(input.charAt(index)))
				getWord(input, input.charAt(index));
		}
		}


	public static void main(String[] args) {
		Assignment20_4 frequencyOfCharacter = new Assignment20_4();
		frequencyOfCharacter.uniqueChar("Nishtha");

	}
}
