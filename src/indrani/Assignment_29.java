/*Program 1 : String Palindrome by writing reverse method logic.
 String input = "naman";
 
 program 2: String Palindrome by without writing reverse method logic.
 */

package indrani;

public class Assignment_29 {
	
	void getPalindromeUsingReverseMethod(String input) {

		char[] ch = input.toCharArray();
		String reverse = "";

		for (int index=ch.length-1;index>=0;index--) {
			reverse = reverse + ch[index];
		}
		if (input.equals(reverse)) {
			System.out.println( input + " ---> Given String is a Palindrome");
		} else {
			System.out.println("Given String is not a Palindrome");
		}
	}
	boolean isPalindrome(String input) {
		int inputLength = input.length();

		while (inputLength > 0) {
			input.charAt(inputLength - 1);
			inputLength--;
		}
		return true;
	}

	void displayPalindromeResult(String input) {
		if (isPalindrome(input)) {
			System.out.println(input + " is palindrome string");
		} else {
			System.out.println(input + " is not a palindrome string");
		}
	}
	public static void main(String[] args) {
		Assignment_29 palindrome = new Assignment_29();
		String word = "naman";
		System.out.println("String = " + word.toString());
		palindrome.getPalindromeUsingReverseMethod(word);
		String input = " malayalam";
		System.out.println("String = " + input.toString());
		palindrome.displayPalindromeResult(input);
	}
}
