package neha.assignment_29;
/*Program 1 : String Pallindrome by writing reverse method logic.
String input = "naman";*/

public class StringPallindromeReversePg1 {
	void findAndDisplayStringPallindrome(String str) {
		String revString = "";
		for (int index = str.length() - 1; index + 1 > 0; index--) {
			revString += str.charAt(index);
		}
		if (revString.equals(str))
			System.out.println("String " + str + " is pallindrome");
		else
			System.out.println("String " + str + " is not pallindrome");
	}

	public static void main(String[] args) {
		StringPallindromeReversePg1 stringPallindromeReversePg1 = new StringPallindromeReversePg1();
		String input = "naman";
		stringPallindromeReversePg1.findAndDisplayStringPallindrome(input);
		input = "parth";
		stringPallindromeReversePg1.findAndDisplayStringPallindrome(input);
	}

}
