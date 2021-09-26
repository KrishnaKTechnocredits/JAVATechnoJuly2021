/*Test - 6 : 10th Sep'2021

Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h 

Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is 
output : techno

*/

package amol_Vyas;

public class CodingTest_6 {

	void getFirstNonRepitativeCharacter(String input) {
		int length = 0;
		while (input.length() > 0) {
			input = input.replace(String.valueOf(input.charAt(0)), "");
			length = input.length();
			if (length - input.replace(String.valueOf(input.charAt(0)), "").length() == 1) {
				System.out.println("First non repitative character is " + input.charAt(0));
				break;
			}
		}
	}

	void getFirstNonRepitativeWord(String input) {
		String[] str = input.split(" ");
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(str[index]) == input.lastIndexOf(str[index])) {
				System.out.println("First non repitative word is " + str[index]);
				break;
			}
		}
	}

	public static void main(String[] args) {
		String input = "technocredits";
		CodingTest_6 codingTest_6 = new CodingTest_6();
		codingTest_6.getFirstNonRepitativeCharacter(input);
		input = "hi this is techno gm credits this hi is";
		codingTest_6.getFirstNonRepitativeWord(input);

	}

}
