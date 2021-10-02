package manaswi;

public class Assignment_40 
{
	void getNumbersFromString(String []str) 
	{
		int temp =0;
		for(int index=0;index<str.length;index++) 
		{
			try 
			{
				temp = Integer.parseInt(str[index]);
				System.out.println(temp);
			}
			catch(NumberFormatException nfe) 
			{
				
			}
		}
	}

	public static void main(String[] args)
	{
		Assignment_40 assignment40 = new Assignment_40();
		String str = "I have 15 years and 3 months of exp";
		String[] input = str.split(" ");
		assignment40.getNumbersFromString(input);
	}
}