package siddharth;

public class Assignment20_2 {
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
	void printFreqOfEachChar(String input) {
		for(int index=0;index<input.length();index++) {
			if(index == input.indexOf(input.charAt(index)))
				getWord(input, input.charAt(index));
		}
		}


	public static void main(String[] args) {
		Assignment20_2 frequencyOfCharacter = new Assignment20_2();
		frequencyOfCharacter.printFreqOfEachChar("Hello");

	}
}
