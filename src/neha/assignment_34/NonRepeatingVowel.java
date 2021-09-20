package neha.assignment_34;

/*program 3 : find first non repeating vowel character from given string.
input : aqapquawrptirse
output : u*/
public class NonRepeatingVowel {
	char findFirstNonRepeatingCharacter(String word) {
		char nonRChar = ' ';
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					&& word.indexOf(ch) == word.lastIndexOf(ch)) {
				nonRChar = ch;
				break;
			}
		}
		return nonRChar;
	}

	public static void main(String[] args) {
		NonRepeatingVowel nonRepeatingVowel = new NonRepeatingVowel();
		String input = "aqapquawrptirse";
		System.out.println("First non repeating vowel character from given string " + input + " --> "
				+ nonRepeatingVowel.findFirstNonRepeatingCharacter(input));
	}

}
