/*Write a method which takes one String parameter and return a reverse String.

Hint : String getReverseString(String input){

return output;
}

input : technocredits
output : stiderconhcet */

package sushant;

public class Assignment_17 {

	String getReverseString(String input) {
		String output = "";
		for (int index = input.length(); index > 0; index--) {
			output += input.charAt(index - 1);
		}
		return output;
	}

	public static void main(String[] args) {
		String input = "technocredits";
		Assignment_17 assignment_17 = new Assignment_17();
		System.out.println("Reverse of input string '" + input + "' is " + assignment_17.getReverseString(input));
	}

}