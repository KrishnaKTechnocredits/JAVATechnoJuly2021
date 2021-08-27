
/*Write a method which takes one String parameter and return a reverse String.

Hint : String getReverseString(String input){

return output;
}

input : technocredits
output : stiderconhcet*/
package shraddha.StringExamples;

public class PrintReverseString {
	public static void main(String[] args) {
		PrintReverseString printReverseString = new PrintReverseString();
		String outputString = printReverseString.getReverseString("ShraddhA");
		System.out.println("Reverse String value of given input String will be :- " + outputString);
		String outputString1= printReverseString.getReverseString("ReverseString");
		System.out.println("Reverse String value of given input String will be :- " + outputString1);
		
	}

	String getReverseString(String inputString) {
		System.out.println("Given Input String is :- " + inputString);
		String reverseString = "";
		for (int index = inputString.length() - 1; index >= 0; index--) {
			reverseString += inputString.charAt(index);
		}
		return reverseString;

	}
}
