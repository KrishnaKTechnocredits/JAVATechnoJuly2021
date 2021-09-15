package indu.Test;

import java.util.Arrays;

public class ShiftingZeroAtLastInArray_T4 
{
	
	 void shiftZeroAtLast(int[] arr)
	{
		int [] output = new int[arr.length];
		int j=0;
		for(int index=0;index<arr.length;index++)
		{
			if(arr[index]!=0)
			{
				output[j]=arr[index];
				j++;
				
			}
		}
		System.out.println("Output Array is : \n"+Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		ShiftingZeroAtLastInArray_T4 test4 = new ShiftingZeroAtLastInArray_T4();
		 int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
		 System.out.println("Input Array is : \n" +Arrays.toString(arr));
		test4.shiftZeroAtLast(arr);
	}
}
