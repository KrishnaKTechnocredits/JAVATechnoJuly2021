package nishi;

public class SurpriseTest1 {
	
	int getSumOfAllDigitsInString(String str)
	{
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				sum+=Character.getNumericValue(str.charAt(i));
			}
		}
		return sum;
	}
	
	int getSumOfAllDigitsInArray(String[] input)
	{
		int sum=0;
		for(int i =0;i<input.length;i++)
		{
			sum+=new SurpriseTest1().getSumOfAllDigitsInString(input[i]);
		}
		return sum;
	}

	public static void main(String[] args) {
		
		String[] input= {"t2e4c","2h7no","3h6h2h5","1mk3","k9g8"};		
		System.out.println("Sum of Digits in a given String :"+new SurpriseTest1().getSumOfAllDigitsInArray(input));
		
	}

}
