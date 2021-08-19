/*
Write a method which takes one String parameter and return a reverse String.

Hint : String getReverseString(String input){

return output;
}

input : technocredits
output : stiderconhcet
*/

package umakant;

public class Assignment17 {

	String getReverseString(String input) {
		String output = "";
		int length = input.length();
		for (int index = (length - 1); index >= 0; index--) {
			output += input.charAt(index);
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		System.out.print(assignment17.getReverseString("technocredits"));
	}

}
