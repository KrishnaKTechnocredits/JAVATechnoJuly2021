package varun.varun_string_assignment;

public class FirstNonRepeatingVowel {
	char getFirstUniqueVowel(String input) {
		char output = ' ';
		for (int i = 0; i < input.length(); i++) {
			if ((input.charAt(i) == 'a') || (input.charAt(i) == 'e') || (input.charAt(i) == 'i') || (input.charAt(i) == 'o')
					|| (input.charAt(i) == 'u')) {
				if (i == input.lastIndexOf(input.charAt(i))) {
					output = input.charAt(i);
					break;
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String input = "aeapquawrpti";
		System.out.println("Output :" + new FirstNonRepeatingVowel().getFirstUniqueVowel(input));
	}
}
