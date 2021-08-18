package indu;

import java.util.Arrays;

public class Assignment_15_B 
{
	int findDiffBtweenSumofEvenandOdd(int[] num) 
	{	int evenSum=0;
		int oddSum=0;
		for(int index = 0; index<num.length ;index++)
		{
			if(num[index] % 2 ==0)
				evenSum += num[index];
			else
				oddSum += num[index];
		}
		if(evenSum>oddSum)
			return evenSum-oddSum;
		else
		return oddSum-evenSum;
	}
	
	public static void main(String[] arg)
	{
		Assignment_15_B assignment_15_b = new Assignment_15_B();
		int[] input = {12,2,13,9};
		int[] input2 = {13,22,10,3};
		
		System.out.println("\nThe Difference between Sum of Even and Odd number of given array " 
							+ Arrays.toString(input)+" is : " +assignment_15_b.findDiffBtweenSumofEvenandOdd(input));
		
		System.out.println("\nThe Difference between Sum of Even and Odd number of given array " 
				+ Arrays.toString(input2)+" is : " +assignment_15_b.findDiffBtweenSumofEvenandOdd(input2));

	}
	
}
