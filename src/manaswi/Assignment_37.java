/*Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.
Example:
Input: Welcome to the family
Output: family*/

package manaswi;

public class Assignment_37
 {
	void secondLargestWord(String str)
	{
		String[] input = str.split(" ");
		String maxWordLength = "";
		String maxSecondWordLength = "";
		for (int index = 0; index < input.length; index++)
		{
			if (input[index].length() > maxWordLength.length()) 
			{
				maxSecondWordLength = maxWordLength;
				maxWordLength = input[index];
			} else if (input[index].length() > maxSecondWordLength.length()) 
			{
				maxSecondWordLength = input[index];
			}
		}
		System.out.println("Second Largest word from the string is: " + maxSecondWordLength);
	}

	public static void main(String[] args)
	{
		String input = "Welcome to the family";
		Assignment_37 slw = new Assignment_37();
		slw.secondLargestWord(input);
	}
}