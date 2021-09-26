/*Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  */

package shraddha.Assignment26;

public class ReverseGivenStringStatement {
	public static void main(String[] args) {
		ReverseGivenStringStatement newObject = new ReverseGivenStringStatement();
		System.out.println("Reverse String will be :- "
				+ newObject.getReverseString("This is Technocredits Training and This is our Assignment"));
	}

	// method to get reverse String from a given input string
	String getReverseString(String inputString) {
		System.out.println("Given Input String is :- " + inputString);
		String reverseString = "";
		for (int index = inputString.length() - 1; index >= 0; index--) {
			reverseString += inputString.charAt(index);
		}
		return reverseString;

	}
}
