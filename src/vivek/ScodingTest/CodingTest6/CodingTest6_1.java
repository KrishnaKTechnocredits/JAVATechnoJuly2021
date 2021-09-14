/*Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h */

package vivek.ScodingTest.CodingTest6;

public class CodingTest6_1 {

	void findNonRepeatingCharacter(String str) {
		for (int index = 0; index < str.length(); index++) {
			if (str.indexOf(str.charAt(index))==str.lastIndexOf(str.charAt(index))) {
				System.out.println(str.charAt(index) + " is the first non repeating character");
				break;
			}	
		}
	}
	
	public static void main(String[] args) {
		CodingTest6_1 codingtest6_1 = new CodingTest6_1();
		String str = "technocredits";
		codingtest6_1.findNonRepeatingCharacter(str);
	}
}
