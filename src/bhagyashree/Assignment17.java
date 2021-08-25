//Write a method which takes one String parameter and return a reverse String.
package bhagyashree;

public class Assignment17 {

	String reverseString(String input) {
		String output = "";
		for (int index = input.length(); index > 0; index--) {
			output = output + input.charAt(index - 1);

		}
		return output;
	}

	public static void main(String[] args) {
		String input = "technocredits";
		Assignment17 assignment17 = new Assignment17();
		System.out.println("Reverse String: " + assignment17.reverseString(input));

	}

}
