package suruchi.Assignment36;

public class Program_A36 {

	boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			return true;
		else
			return false;
	}

	void displayReplaceVowelString(String input) {
		char[] charArr = input.toCharArray();
		String str = "";
		int vowelCount = 0;
		for (int index = 0; index < charArr.length; index++) {
			if (isVowel(charArr[index])) {
				vowelCount++;
				str += charArr[index];
			}
		}
		for (int index2 = 0; index2 < charArr.length; index2++) {
			if (isVowel(charArr[index2])) {
				charArr[index2] = str.charAt(--vowelCount);
			}
		}
		System.out.println("String with vowel placements reversed is: " + String.valueOf(charArr));
	}

	public static void main(String[] args) {
		Program_A36 program_a36 = new Program_A36();

		String input1 = "good morning";
		System.out.println("String is: " + input1);
		program_a36.displayReplaceVowelString(input1);

		String input2 = "amol";
		System.out.println("\nString is: " + input2);
		program_a36.displayReplaceVowelString(input2);

		String input3 = "haorseuih";
		System.out.println("\nString is: " + input3);
		program_a36.displayReplaceVowelString(input3);

	}
}