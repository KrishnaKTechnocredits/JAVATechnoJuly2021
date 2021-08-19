package manaswi;
public class Assignment_15_Program2 
{

	char[] getMidCharOfStringArr(String[] input)
	{
		int midIndex = 0;
		char[] output = new char[input.length];
		for (int index = 0; index < input.length; index++)
		{
			if (input[index].length() % 2 == 0) {
				midIndex = input[index].length() / 2 - 1;
			} else {
				midIndex = input[index].length() / 2;
			}
			output[index] = input[index].charAt(midIndex);
		}
		return output;
	}

	public static void main(String[] args) 
	{
		String[] input = { "hello", "techno", "credits" };
		char[] output = new char[input.length];
		Assignment_15_Program2 assignment_15_Program_2 = new Assignment_15_Program2();
		output = assignment_15_Program_2.getMidCharOfStringArr(input);
		for (int index = 0; index < output.length; index++) {
			System.out.println("Middle Character of string '" + input[index] + "' is " + output[index]);
		}

	}

}