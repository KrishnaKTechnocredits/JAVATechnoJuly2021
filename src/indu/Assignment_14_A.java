package indu;

import java.util.Arrays;

public class Assignment_14_A {

	int  findMaxNumber(int[] numbers) 
	{
		//System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~First program ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		int max=numbers[0];
		for(int index =0; index<numbers.length; index++)
		{
			if(numbers[index]>max)
			{
				max =numbers[index];
			}
		}
		System.out.println("Maximum number from given arrray "+Arrays.toString(numbers) + " is : " + max);	
		return max;
	}
	
	
	int findMinNumber(int[] numbers) 
	{
		//System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~Second program ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		int min=numbers[0];
		for(int index =0; index<numbers.length; index++)
		{
			if(numbers[index]<min)
			{
				min =numbers[index];
			}
		}
		System.out.println("Maximum number from given arrray "+Arrays.toString(numbers) + " is : " + min);	
		return min;
	}
	
	
	public static void main(String [] ar)
	{
		Assignment_14_A a = new Assignment_14_A();
		int[] input = {-1,-11,-44,23,-55,99,-23};
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~First program ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		a.findMaxNumber(input);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~Second program ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		a.findMinNumber(input);
		
	}
	
}
