/*Assignment - 34 : 11th Sep'2021
program 3 : find first non repeating vowel character from given string.
input : aeapquawrpti
output : u*/

package shraddha.Assignment34;

public class FirstNonRepeatingVowel {
	public static void main(String[] args) {
		String inputString = "aeapquawrpti";
		char nonRepeatVowel = ' ';
		System.out.println("Input word is :- " + inputString);
		for (int index = 0; index < inputString.length(); index++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < inputString.length(); innerIndex++) {
				if (inputString.charAt(index) == inputString.charAt(innerIndex)) {
					count++;
					if (inputString.charAt(index) == 'a' || inputString.charAt(index) == 'e'
							|| inputString.charAt(index) == 'i' || inputString.charAt(index) == 'o'
							|| inputString.charAt(index) == 'u')
						nonRepeatVowel = inputString.charAt(index);
				}
				if (count > 1)
					break;
			}
			if (count == 1)
				break;
		}
		System.out.println("Non repeating vowel in the given word is :- " + nonRepeatVowel);
	}

}
