package manaswi;
public class Assignment_22_Program2 
{
	int getTotalDigits(String str) 
	{
		int count = 0;
		for (int index = 0; index < str.length(); index++) 
		{
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				count++;
		}
		return count;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "Te1ch2no3cr4ed3it4s";
		Assignment_22_Program2 totalDigit = new Assignment_22_Program2();
		int count = totalDigit.getTotalDigits(str);
		System.out.println("Total digits in a given string is " + count);
	}
}