/*Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  */

package amol_Vyas.Assignment_26;

public class ReverseOfString {

	void getReverseOfString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output += input.charAt(index);
		}
		System.out.println("Reverse of given String is " + output);
	}

	public static void main(String[] args) {
		String input = "This is technocredits";
		ReverseOfString reverseOfString = new ReverseOfString();
		reverseOfString.getReverseOfString(input);
	}
}
