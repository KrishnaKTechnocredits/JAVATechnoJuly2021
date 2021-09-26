package neha;

/*Program 1: Find first non repeating character from a word. [expected : 10 mins, actual: 5 min]
input : technocredits
output : h*/
public class NonRepeatingCharCodingTest6 {
	void findAndDisplayFirstNonRepeatingChar(String str) {
		char nonRChar = ' ';
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				nonRChar = ch;
				break;
			}
		}
		System.out.println("First non repeating character--> " + nonRChar);
	}

	public static void main(String[] args) {
		NonRepeatingCharCodingTest6 nonRepeatingChar = new NonRepeatingCharCodingTest6();
		String input = "technocredits";
		nonRepeatingChar.findAndDisplayFirstNonRepeatingChar(input);
	}

}
