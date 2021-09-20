package amol_Pawar.assignment_34;

public class Program_3 {

	void getNonRepeatingVowel(String input) {
		for (int index = 0; index < input.length(); index++) {

			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				if (input.indexOf(ch) == input.lastIndexOf(ch)) {
					System.out.println("First non repeating vowel character from given string " + input + " is " + ch);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Program_3 program_3 = new Program_3();
		String input = "aeapquawrpti";
		program_3.getNonRepeatingVowel(input);

	}

}
/*
 * program 3 : find first non repeating vowel character from given string. input
 * : aeapquawrpti output : u
 */