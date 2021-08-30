/*Programming Test - 2 : 30th Aug 2021

Convert all lowercase to uppercase and uppercase to lowercase in a given string.

Input : A1ashVi6
Output : a1ASHvI6*/
package shraddha.CodingTest;

public class StringSmallToCapitalViceVersa {
	public static void main(String[] args) {
		StringSmallToCapitalViceVersa newObject = new StringSmallToCapitalViceVersa();
		String inputString = "A1ashVi6";
		System.out.println("Input String is :- " + inputString);
		System.out.println("After changing case of each character in the given string.. Output string will be like :-"
				+ newObject.changeCaseOfString(inputString));
	}

	// method to change case of each character in the given String
	String changeCaseOfString(String inputString) {
		String outputstring = "";
		for (int index = 0; index < inputString.length(); index++) {
			if (Character.isUpperCase(inputString.charAt(index))) {
				outputstring += Character.toLowerCase(inputString.charAt(index));
			} else if (Character.isLowerCase(inputString.charAt(index))) {
				outputstring += Character.toUpperCase(inputString.charAt(index));
			} else if (Character.isDigit(inputString.charAt(index))) {
				outputstring += inputString.charAt(index);
			}
		}
		return outputstring;
	}

}
