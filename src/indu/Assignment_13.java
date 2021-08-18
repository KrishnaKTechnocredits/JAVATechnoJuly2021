package indu;

import java.util.Arrays;

public class Assignment_13 
{
	int findCountOfPositiveNumbers(int [] numbers)
	{	
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~First program ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int count = 0;
		for (int index = 0 ; index < numbers.length ;index++ )
		{
			if(numbers[index]>0)
				count++;
		}
		return count;
	}
	
	int countNumberOfZero(int [] numbers)
	{
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~Second program ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		int count = 0;
		for (int index = 0 ; index < numbers.length ;index++ )
		{
			if(numbers[index]==0)
				count++;
		}
		return count;
	}
	
	int[] smallNumbers(int number) 
	{
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~Third program ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("5 smaller number than " +number + " is : ");
		int[] output = new int[5]; 
		for (int index=0 ; index<output.length; index++)
		{	
			output[index] = number-1;
			number--;
			System.out.println(output[index] + " "); // solution if client dosen't want return value.
		}
		return output;
	}
		
		
	
	public static void main(String[] arg) 
	{
		Assignment_13 count = new Assignment_13();
		int [] num = {1,-11,-44,23,55,-99,-23,-22};
		System.out.println("\n Count of positive number from given array i.e "
							+ Arrays.toString(num) + " : " + count.findCountOfPositiveNumbers(num));
		
		int [] num2 = {1,-11,0,0,55,0,-23,0};
		System.out.println("\nCount  number of zero from given array i.e "
				+ Arrays.toString(num2) + " : " + count.countNumberOfZero(num2));
		
		//first solution of 3rd program 
		int arr[]= count.smallNumbers(55);
		System.out.println("\n5 smaller numbers are :" + Arrays.toString(arr));
		
		//second solution of 3rd program
		System.out.println("\nSmaller number are : ");
		for(int index =0 ; index <arr.length ;index++)
			System.out.print(arr[index] + " ");
	}
}

