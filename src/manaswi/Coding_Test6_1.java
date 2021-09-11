package manaswi;
public class Coding_Test6_1 
{
	int count = 0;

	void getFirstNonRepeatingCharacter(String str) 
	{

		for (int index = 0; index < str.length(); index++)
		{
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) 
			{
				System.out.println(str.charAt(index));
				break;
			}

		}
	}

	public static void main(String[] args)
	{
		Coding_Test6_1 coding_Test6_1 = new Coding_Test6_1();
		System.out.println("Find first non repeating character from a word:");
		String input = "technocredits";
		coding_Test6_1.getFirstNonRepeatingCharacter(input);
	}
}