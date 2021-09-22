package monali.Assignment_34;

/*program 3 : find first non repeating vowel character from given string.
input : aeapquawrpti
output : e*/

public class NonRepeatingVowel {

	char getFirstNonRepeatingVowel(String str) {
		char ch = ' ';
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch) && ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
				//System.out.println("All Non Repeating Vowels in string : "+ch);
				break;
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		String input = "aeapquawrpti";
		NonRepeatingVowel nonrepeatVowel = new NonRepeatingVowel();
		System.out.println("First NonRepeating Vowel is : " + nonrepeatVowel.getFirstNonRepeatingVowel(input));
	}
}