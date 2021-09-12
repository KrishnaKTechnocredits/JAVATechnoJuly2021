package shantanu.codingTest6;

public class NonRepeatingChar {
	char getNonRepeatingCharFromWord(String word) {
		char ch = ' ';
		for(int index = 0; index < word.length(); index++) {
			ch = word.charAt(index);
			if(word.indexOf(ch) == word.lastIndexOf(ch))
				break;
		}
		return ch;
	}
	void displayNonRepeatingCharFromWord(String word) {
		System.out.println("Non repeating character is: "+getNonRepeatingCharFromWord(word));
	}
	public static void main(String[] args) {
		NonRepeatingChar nonRepeatingChar = new NonRepeatingChar();
		String word = "technocredits";
		nonRepeatingChar.displayNonRepeatingCharFromWord(word);
	}
}
