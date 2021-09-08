/*Assignment - 29 : 7th Sep'2021
 
 Program 1 : String Pallindrome by writing reverse method logic.
 String input = "naman";
 
 program 2: String Pallindrome by without writing reverse method logic.
 String input = "naman";
 String input = "aabbaa";
 
 String input = "malayalam";
 boolean isPallindrome(String input){
 
 }
 
 void displayPallindromeResult(String input){
	if(isPallindrome(input))
			sop(input + " is pallindrome");
		else
			sop(input + " is not a pallindrome");
 }
 
 main(){
		String input = "madam";
		test.displayPallindromeResult(input);
 }
 
 (optional)program 3 : given number is pallindrome or not, without converting it input into String?
 int num = 12321;
 ans : true
 
 Hint : % and */
package shalaka.Assignment29;

public class StringPalindrome {
	//boolean isPalindrome = true;

	boolean isPalindrome(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			char ch = input.charAt(index);
			output += ch;
		}
		if (input.equals(output))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		String input = "naman";
		StringPalindrome stringPalindrome = new StringPalindrome();
		boolean isPalindrome = stringPalindrome.isPalindrome(input);
		if (isPalindrome)
			System.out.println(input + " is Palindrome");
		else
			System.out.println(input + " is not Palindrome");
	}
}
