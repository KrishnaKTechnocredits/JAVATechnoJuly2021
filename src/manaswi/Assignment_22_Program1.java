package manaswi;
public class Assignment_22_Program1
 {
	int getSumOfDigits(String str)
	{
		int sum = 0;
		for (int index = 0; index < str.length(); index++) 
		{
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				sum += Character.getNumericValue(ch);
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		String str = "Te11ch2no3cr4edi2ts";
		Assignment_22_Program1 sumOfDigits = new Assignment_22_Program1();
		int sum = sumOfDigits.getSumOfDigits(str);
		System.out.println("sum of all the digits in a given string is " + sum);
	}
}