package indu_Assignment_29;

public class IsStringPalindromeUsingReverse
{
	boolean isStringPalindrome(String input)
	{
		String str = "";
		for(int index=input.length()-1;index>=0;index--)
		{
			str += input.charAt(index);
		}
		
		if(input.equalsIgnoreCase(str))
			return true;
		else 
			return false;
	}
	
	void displayIsPalindrome(String input)
	{
		if(isStringPalindrome(input))
			System.out.println(input + " is Palindrome...!!");
		else
			System.out.println(input + " is not a Palindrome...!!");
	}
	
	public static void main(String[] args) {
		IsStringPalindromeUsingReverse isStringPalindromeUsingReverse = new IsStringPalindromeUsingReverse();
		isStringPalindromeUsingReverse.displayIsPalindrome("Madam");
		isStringPalindromeUsingReverse.displayIsPalindrome("Mama");
	
	}
}
