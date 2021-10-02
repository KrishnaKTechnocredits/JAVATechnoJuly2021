/*program 3 : find first non repeating vowel character from given string.
input : aapquawrpti
output : u*/

package sayli_Vyavhare.Assignment34;

public class Non_RepeatingVowel {

	void getNonRepeatingVowel(String str) {
		System.out.print("First non-repeating vowel is: ");
		for (int index = 0; index < str.length(); index++) {
			char vowel = str.charAt(index);
			if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {

				if (str.indexOf(vowel) == str.lastIndexOf(vowel)) {
					System.out.print(vowel);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Non_RepeatingVowel non = new Non_RepeatingVowel();
		non.getNonRepeatingVowel("aapquawrpti");
	}

}
