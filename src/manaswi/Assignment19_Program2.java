package manaswi;
public class Assignment19_Program2
 {
	String getMaxLengthWordInString(String str) 
	{
		int maxLength = 0;
		String maxLengthWord = "";
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++)
		{
			if (arr[index].length() > maxLength) 
			{
				maxLength = arr[index].length();
				maxLengthWord = arr[index];
			}
		}
		return maxLengthWord;
	}

	public static void main(String[] args)
	{
		Assignment19_Program2 assignment19_Program2 = new Assignment19_Program2();
		String input = "good morning technocredits hi hello";
		System.out.println("String is as displayed: " + input);
		System.out.println();
		System.out.println("Word with the maximum length is: " + assignment19_Program2.getMaxLengthWordInString(input));
	}
}