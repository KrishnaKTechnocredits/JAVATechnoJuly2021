package chandni_bhoj_Assignment_24;

public class Program_1 {

	int getVowelCount (String input) {
		int count = 0;
		String vowel = " ";
		for (int index = 0; index < input.length(); index ++) {
			if (index == input.indexOf(input.charAt(index))) {
				if (input.charAt(index) == 'a' || input.charAt(index) == 'e' || input.charAt(index) == 'i' || input.charAt(index) == 'o' || input.charAt(index) == 'u') {
					vowel += String.valueOf(input.charAt(index));
					count++;
				}
			}	
		}
			System.out.println ("Vowels are : " + vowel);
			return count;
	}
	
	public static void main(String[] args) {
		System.out.println (new Program_1().getVowelCount("technocredits"));
	}

}