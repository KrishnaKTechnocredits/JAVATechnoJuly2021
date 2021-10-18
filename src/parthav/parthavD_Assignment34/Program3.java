/*program 3 : find first non repeating vowel character from given string.
input : aeapquawepti
output : u
*/

package parthav.parthavD_Assignment34;

public class Program3 {
	
	boolean isVowel(char ch){
		boolean isVowel = false;
		switch(ch) {
			case 'a':
				isVowel = true;
				break;
			case 'e':
				isVowel = true;
				break;
			case 'i':
				isVowel = true;
				break;
			case 'o':
				isVowel = true;
				break;
			case 'u':
				isVowel = true;
				break;
		}
		return isVowel;
	}

	void findFirstNonRepeatingVowel(String str){
		System.out.println("The first non-repearing vowel in the String is: ");
		for (int index = 0; index < str.length(); index++){
			char ch = str.charAt(index);
			if (isVowel(ch)){
				if (str.indexOf(ch) == str.lastIndexOf(ch)){
					System.out.println(ch);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		String str = "aeapquawepti";
		new Program3().findFirstNonRepeatingVowel(str);

	}

}
