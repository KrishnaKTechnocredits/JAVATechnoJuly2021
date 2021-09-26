package amol_Pawar.assignment_34;

import java.util.Arrays;

public class Program_2 {

	void putSumOfTriple(int input[])
	{
		int count=0;
		for(int index=0;index<input.length;index++)
		{
			if(index<input.length-2)
			{
				if(input[index]==input[index+1]-1 && input[index]==input[index+2]-2)
				{
					count++;
				}
			}
		}
		int arr[]=new int[input.length+count];
		int outputIndex=0;
		for(int index=0;index<input.length;index++)
		{
			
			if(index<input.length-2)
			{
				if(input[index]==input[index+1]-1 && input[index]==input[index+2]-2)
				{
					arr[outputIndex]=input[index];
					arr[outputIndex+1]=input[index+1];
					arr[outputIndex+2]=input[index+2];
					int sum=arr[outputIndex+2]+arr[outputIndex+1]+arr[outputIndex];
					arr[outputIndex+3]=sum;
					outputIndex=outputIndex+4;
					index=index+2;
				}
				else
				{
					arr[outputIndex]=input[index];
					outputIndex++;
				}
			}
			else
			{
				arr[outputIndex]=input[index];
			}
		}
		System.out.println("Input Array before execution of program is        "+Arrays.toString(input));
		System.out.println("Sum of triple after each triple which in sequence "+Arrays.toString(arr));
	}
	public static void main(String[] args) {
		
		Program_2 program_2 =new Program_2();
		int []input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		program_2.putSumOfTriple(input);
	}

}
/*program 2 : place sum of triple after each triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
output = [1,3,4,5,12,7,3,9,10,11,30,14,44,67,1,2,3,6,99];*/
