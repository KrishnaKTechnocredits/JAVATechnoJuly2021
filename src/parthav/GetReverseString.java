//Assignment 17;

package parthav;

public class GetReverseString {

	String getReverseString(String str) {
		String reversedString = "";

		for (int index = str.length() - 1; index >= 0; index--) {
			reversedString += str.charAt(index);
		}

		return reversedString;
	}

	public static void main(String[] args) {
		String str = "TechnoCredits";
		GetReverseString newObject = new GetReverseString();
		System.out.println("The reversed string is: " + newObject.getReverseString(str));

	}

}
