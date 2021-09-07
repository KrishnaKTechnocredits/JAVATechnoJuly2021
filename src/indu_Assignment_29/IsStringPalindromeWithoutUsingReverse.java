package indu_Assignment_29;


public class IsStringPalindromeWithoutUsingReverse 
{
	boolean isStringPalindrome(String input) // complex method
	{
		String str = "";
		String str1 = "";
		int j=input.length()-1;
			while(j>=0)
			{
				int index=0;
				str += input.charAt(index);
				str1 += input.charAt(j--);
				if(str1.equalsIgnoreCase(str))
				{
					index++;
					return true;
				}
				else
					return false;
			}
			return true;
	}
	
	boolean isStringPalindrome2(String str) 
	{
		boolean flag=true;
		for(int index=0;index<str.length()/2 ;index++)
		{
			if(str.charAt(index)==str.charAt(str.length()-index-1))
			{
				flag=true;
			}
			else
				flag=false;
		}
		return flag;
	}
			
	void displayIsPalindrome(String input)
	{
		if(isStringPalindrome2(input))
			System.out.println(input + " is Palindrome...!!");
		else
			System.out.println(input + " is not a Palindrome...!!");
	}
	public static void main(String[] args) {
		IsStringPalindromeWithoutUsingReverse isStringPalindromeWithoutUsingReverse = new IsStringPalindromeWithoutUsingReverse();
		isStringPalindromeWithoutUsingReverse.displayIsPalindrome("Malayalam");
		isStringPalindromeWithoutUsingReverse.displayIsPalindrome("Mama");
		isStringPalindromeWithoutUsingReverse.displayIsPalindrome("Mallam");
		isStringPalindromeWithoutUsingReverse.displayIsPalindrome("Madam");
	}
}
