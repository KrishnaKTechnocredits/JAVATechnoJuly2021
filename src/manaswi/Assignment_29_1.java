package manaswi;

public class Assignment_29_1 
{

	boolean isStringPallindrome(String input)
	{
		String output = "";
		for(int index=input.length()-1; index>=0; index--)
		{
			output = output + input.charAt(index);
		}
		if(input.equals(output))
			return true;
		return false;
	}

	void displayPallindromeResult(String input)
	{
		if(isStringPallindrome(input))
			System.out.println(input + " is pallindrome string.");
		else
			System.out.println(input + " is not a pallindrome string.");
	}

	public static void main(String[] args)
	{
		String input = "naman";
		Assignment_29_1 program_1 = new Assignment_29_1();
		program_1.displayPallindromeResult(input);
	}
}