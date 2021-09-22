package shantanu.assignment34;

public class NonRepeatingVowel {
	char getNonRepeatingVowel(String str) {
		char vowel  = ' ';
		str = str.toLowerCase();
		for(int index = 0; index < str.length()-1; index++) {
			if(str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i' || str.charAt(index) == 'o' || str.charAt(index) == 'u') {
				if(str.indexOf(str.charAt(index)) == str.lastIndexOf(str.charAt(index))) {
					vowel = str.charAt(index);
					break;
				}
			}
				
		}
		
		return vowel;
	}
	void displayNonRepeatingVowel(String str) {
		System.out.println("Non-repeating vowel is: "+getNonRepeatingVowel(str));
	}
	public static void main(String[] args) {
		NonRepeatingVowel nonRepeatingVowel = new NonRepeatingVowel();
		String str = "aeapquawrpti";
		nonRepeatingVowel.displayNonRepeatingVowel(str);
	}
}
