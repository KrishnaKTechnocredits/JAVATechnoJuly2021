package manaswi;

public class Assignment_20_Program3 
{

	void getStringFromUser(String input) 
	{
		for (int index = 0; index < input.length(); index++) 
		{
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch))
				System.out.println("Non repetative words in String " + input + " : " + ch);
			// getUniqueCharFromString(String input, char ch);
		}
	}

	public static void main(String[] args)
	{
		Assignment_20_Program3 program_3 = new Assignment_20_Program3();
		program_3.getStringFromUser("technocredits");
	}

}