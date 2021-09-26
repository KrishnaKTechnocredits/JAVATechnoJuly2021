package rushikesh.assign34;
/*
 
program 3 : find first non repeating vowel character from given string.
input : aeapquawrpti
output : u

 */
public class Assign34_3 {
	void findFirstNonRepeatingVowel(String word) {
	word = word.toLowerCase();
	while (word.length() > 0) {
		char ch = word.charAt(0);
		int wordLength = word.length();
		word = word.replace(Character.toString(ch), "");
		if ((wordLength - word.length() == 1) && (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
			System.out.println("First non repeating vowel in string is:" + ch);
			return;
		}
	}
	System.out.println("Non repeating vowels are not present in string");
}
	public static void main(String[] args) {
		Assign34_3 assign34_3=new Assign34_3();
		assign34_3.findFirstNonRepeatingVowel("aeapquawrpti"); 			
	}
}
