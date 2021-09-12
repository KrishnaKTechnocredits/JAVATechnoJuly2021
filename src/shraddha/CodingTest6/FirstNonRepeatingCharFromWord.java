/*Test - 6 : 10th Sep'2021

Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h */

package shraddha.CodingTest6;

public class FirstNonRepeatingCharFromWord {
	public static void main(String[] args) {
		String inputString = "technocredits";
		System.out.println("input word is :- "+inputString);
		char nonRepeatChar = ' ';
		for (int index = 0; index < inputString.length(); index++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < inputString.length(); innerIndex++) {
				if (inputString.charAt(index) == inputString.charAt(innerIndex)) {
					nonRepeatChar = inputString.charAt(index);
					count++;
				}
				if (count > 1)
					break;
			}
			if (count == 1)
				break;
		}
		System.out.println("First non repeating character from the above word is :- "+nonRepeatChar);
	}

}
