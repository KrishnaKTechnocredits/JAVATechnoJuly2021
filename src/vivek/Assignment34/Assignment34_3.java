/*program 3 : find first non repeating vowel character from given string.
input : aeapquawrpti
output : e*/

package vivek.Assignment34;

public class Assignment34_3 {

	void firstNonRepeatingVowel(String str) {
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i'
					|| str.charAt(index) == 'o' || str.charAt(index) == 'u') {
				if (str.indexOf(str.charAt(index)) == str.lastIndexOf(str.charAt(index))) {
					System.out.println("First non repeating vowel is " + str.charAt(index));
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment34_3 assignment34_3 = new Assignment34_3();
		String str = "aeapquawrpti";
		assignment34_3.firstNonRepeatingVowel(str);
	}
}
