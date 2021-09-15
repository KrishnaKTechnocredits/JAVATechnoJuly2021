package manaswi;
public class Assignment_29_2 
{

	boolean isPallindrome(String input)
	{
		int count = input.length();
		int middleIndex = count/2;
		boolean flag = true;
		if(middleIndex/2==0) {
			for (int index=0; index<=middleIndex-1; index++)
			{
				if(input.charAt(index)!=input.charAt(count-1))
				{
					flag = false;
					break;
				}
				else 
					count --;
			}
		}
		else 
		{
			for (int index=0; index<middleIndex; index++)
			{
				if(input.charAt(index)!=input.charAt(count-1))
				{
					flag = false;
					break;
				}
				else 
					count --;
			}
		}
		return flag;
	}

	void displayPallindromeResult(String input)
	{
		if(isPallindrome(input))
			System.out.println(input + " is pallindrome string.");
		else
			System.out.println(input + " is not a pallindrome string.");
	}

	public static void main(String[] args)
	{
		String input = "malayalam";
		String input2 = "aabbaa";
		String input3 = "manaswi";
		Assignment_29_2 program_2 = new Assignment_29_2();
		program_2.displayPallindromeResult(input);
		program_2.displayPallindromeResult(input2);
		program_2.displayPallindromeResult(input3);
	}
}
