package aniket;

public class Program4 {

	void getDuplicateCharFromString(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {

			if (ch == input.charAt(index)) {
				count++;
			}
		}
		if (count > 1)
			System.out.println("Repetative character in String " + input + " : " + ch + " " + count);
	}

	void getStringFromUser(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == index)
				getDuplicateCharFromString(input, ch);
		}
	}

	public static void main(String[] args) {
		Program4 program_4 = new Program4();
		program_4.getStringFromUser("aaniket");
	}

}
