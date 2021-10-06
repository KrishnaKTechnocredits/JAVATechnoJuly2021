package manaswi;
public class Assignment_42
 {
	void RemovedMultiplecharactersOcc(String str)
	{
		String output = "";
		for (int index = 0; index < str.length(); index++) 
		{
			char ch = str.charAt(index);
			if (str.indexOf(ch) == index) 
			{
				output += ch;
			}
		}
		System.out.println(output);

	}

	void RemoveDuplicatecharactersOcc(String str) 
	{
		String output = "";
		for (int index = 0; index < str.length(); index++)
		{
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) 
			{
				output += ch;
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args)
	{
		Assignment_42 assignment_42 = new Assignment_42();
		String input = "technocredits";
		System.out.println("Find String by removing multiple occurrence of characters :");
		assignment_42.RemovedMultiplecharactersOcc(input);
		System.out.println("Find String by removing all occurrence of duplicate characters :");
		assignment_42.RemoveDuplicatecharactersOcc(input);

	}
}