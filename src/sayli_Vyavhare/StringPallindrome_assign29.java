/*Program 1 : String Pallindrome by writing reverse method logic.
 String input = "naman";
 
 program 2: String Pallindrome by without writing reverse method logic.
 String input = "naman";
 String input = "aabbaa";
 
 String input = "malayalam";
 
  */
package sayli_Vyavhare;

public class StringPallindrome_assign29 {

	String getReverse(String input) {
		char ch;
		String temp = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			ch = input.charAt(index);
			temp = temp + ch;
		}
		return temp;
	}

	void getPallindrome(String input) {

		String reverse = getReverse(input);
		if (input.equals(reverse))
			System.out.println(input + " is pallindrome");
		else
			System.out.println(input + " is not pallindrome");
	}

	boolean isPallindrome(String input) {
		boolean temp = false;

		for (int index = 0; index < input.length(); index++) {

			for (int innerindex = input.length() - 1; innerindex >= 0; innerindex--) {
				if (input.charAt(index) == input.charAt(innerindex)) {
					temp = true;
				} else
					temp = false;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		StringPallindrome_assign29 test = new StringPallindrome_assign29();
		System.out.println("String Pallindrome by  writing reverse method logic.");
		String input = "malayalam";
		test.getPallindrome(input);
		test.getPallindrome("ananya");

		System.out.println("\n" + "String Pallindrome  without writing reverse method logic.");

		String input1 = "naman";

		if (test.isPallindrome(input1))
			System.out.println(input1 + " is Pallindrome");

		else
			System.out.println(input1 + " is not Pallindrome");
	}
}
