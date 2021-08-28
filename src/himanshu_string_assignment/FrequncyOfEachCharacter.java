package himanshu_string_assignment;

public class FrequncyOfEachCharacter {

	void charCount(String input, char ch) {

		int count = 0;

		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		System.out.println(ch + " " + count);
	}

	void freqOfEachChar(String input) {

		for (int index = 0; index < input.length(); index++) {
			if (index == input.indexOf(input.charAt(index)))
				charCount(input, input.charAt(index));
		}
	}

	public static void main(String[] args) {

		FrequncyOfEachCharacter program2 = new FrequncyOfEachCharacter();
		program2.freqOfEachChar("hello");
	}
}
