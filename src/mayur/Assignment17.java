/*
 * Write a method which takes one String parameter and return a reverse String.

Hint : String getReverseString(String input){

return output;
}

input : technocredits
output : stiderconhcet
 */

package mayur;

public class Assignment17 {

	String getReverseString(String input) {
		char ch[] = input.toCharArray();
		String str = "";
		for (int index = ch.length - 1; index >= 1; index--) {
			str += ch[index];
		}
		return str;

	}

	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		String input = "technocredits";
		System.out.println(assignment17.getReverseString(input));
	}
}
