package manaswi;
public class SumOfAllDigits 
{

	int getSumOfAllDigits(String input)
	{
		int sum = 0;
		for(int index=0; index<input.length(); index++)
		{
			if(Character.isDigit(input.charAt(index)))
			sum += Character.getNumericValue(input.charAt(index));
			}
		return sum;
		}

	int getSumOfAllDigitsInArray(String[] input)
	{
		int totalSum =0;
		for(int index=0; index<input.length; index++)
		totalSum += getSumOfAllDigits(input[index]);
		return totalSum;
	}

	public static void main(String[] args)
	{
		SumOfAllDigits sumOfAllDigits = new SumOfAllDigits();
		String[] inputArray = {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		System.out.println("The total sum = "+sumOfAllDigits.getSumOfAllDigitsInArray(inputArray));
	}
}