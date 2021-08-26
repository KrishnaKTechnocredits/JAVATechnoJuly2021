package indu;

import java.util.Arrays;

public class CalculateDigitSumInStringArray
{
	int getSumofdigitInStringArray(String[] input)
	{
		int sum =0;
		 for(int index=0 ;index<input.length ;index++)
		 {
			 sum += getSumofdigitInString(input[index]);
 		 }
		return sum;
	}
	
	int getSumofdigitInString(String input)
	{
		
		int sum =0;
		 for(int index=0 ;index<input.length() ;index++)
		 {
			 if(Character.isDigit(input.charAt(index)))
			 {
				 sum += Character.getNumericValue(input.charAt(index)) ;
			 }
		 }
		return sum;
	}
	
	int getSumusingSplit(String[] str)
	{
		int sum=0;
		String input = Arrays.toString(str);
		String[] arr = input.split("[^0-9]+");
		for(int i= 1 ;i <arr.length ;i++)
		{
			sum += Integer.parseInt(arr[i]);
		}
		return sum;
	}
	
	public static void main(String[] arg)
	{
		CalculateDigitSumInStringArray calculateDigitSumInStringArray = new CalculateDigitSumInStringArray();
		String input[] = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
		System.out.println("\nSum of all digits in given array is : " + calculateDigitSumInStringArray.getSumofdigitInStringArray(input));
		System.out.println("\nSum of all digits in given array is : " + calculateDigitSumInStringArray.getSumusingSplit(input));

	}	
}
