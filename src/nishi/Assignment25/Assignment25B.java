package nishi.Assignment25;

public class Assignment25B {
	
	int getSumOfNumbersInString(String input)
	{
		String str="";
		int sum=0;
		for(int i=0;i<input.length();i++)
		{
			if(Character.isDigit(input.charAt(i)))
			{
				str+=input.charAt(i);
			}
			else
			{
				if(!str.equals(""))
				{
					sum = sum+Integer.parseInt(str);
					str="";
				}
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String input = "te12ch33no3credit4s";
		System.out.println("Sum Of Nos is "+new Assignment25B().getSumOfNumbersInString(input));
	}

}
