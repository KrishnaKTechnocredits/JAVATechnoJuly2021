/* Assignment - 34 : 11th Sep'2021
program 3 : find first non repeating vowel character from given string.
input : aeapquawrpti
output : u
*/

package akanksha_Jain.Assignment_34;

public class Program_3 {
	
	void findFirstNonRepeatVowel(String input) {
		char output='\0';
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u') {
				if(index == input.lastIndexOf(ch)) {
						output = ch;
						break;
				}
			}
		}
		System.out.println("First non repeating vowel in " + input + " is " + output);
	}

	public static void main(String[] args) {
		String input = "aeapquawrpti";
		Program_3 program3 = new Program_3();
		program3.findFirstNonRepeatVowel(input);
	}
}