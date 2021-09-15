package indu;

import java.util.Arrays;

public class FindSecondMaxNumberinArray_A28_1 {
	
	static int find2ndHigestNumberinArray(int[] arr)
	{
		int maxNum=arr[1];
		int secondMaxNum=arr[0];
		
		for(int index=2;index<arr.length;index++)
		{
			if(maxNum<arr[index])
			{	
				secondMaxNum=maxNum;
				maxNum=arr[index];
			}
			else if(secondMaxNum<arr[index])
			{
				secondMaxNum=arr[index];
			} 
		}
		return secondMaxNum;
	}

	public static void main(String[] args) {
		int[] arr = {10,23,2,11,55,43,99,110,55,20,111};
		System.out.println("Second max number of input Array: \n"+Arrays.toString(arr)+" is : "+find2ndHigestNumberinArray(arr));
	}
}
