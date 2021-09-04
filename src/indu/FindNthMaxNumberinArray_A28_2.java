package indu;

import java.util.Arrays;

public class FindNthMaxNumberinArray_A28_2 {

	//static int[] arr = {10,23,2,11,55,43,99,110,55,20,111};

	int findMaxNumber(int[] arr)
	{
		int maxNum=arr[0];
		int maxIndex=0;
		for(int index=0;index<arr.length;index++)
		{
			if(maxNum<arr[index])
			{
				maxNum=arr[index];
				maxIndex = index;
			}
			 
		}
		arr[maxIndex]=0;
		 return maxNum;
	}
	
	void findNthMaxNumber(int[] arry,int num)
	{
		int[] arry2= new int[arry.length];
		for (int index=0; index<arry.length; index++) {
			arry2[index]=arry[index];
		}
		int numMax=0;
		if(num>0 && num<arry.length)
		{
			for(int index=0 ;index<num;index++)
			{
				numMax=findMaxNumber(arry2);
			}
			System.out.println("Higest "+num+" number in array is : "+numMax);
		}
		else
			System.out.println(num+" is invalid number.Please provide valid Number !!!!!!!!!!!");
	}
	
	public static void main(String[] args) {
		
		FindNthMaxNumberinArray_A28_2 findNthMaxNumberinArray_A28_2 = new FindNthMaxNumberinArray_A28_2();
		int[] arr = {10,23,2,11,55,43,99,110,55,20,111};
		System.out.println("Input array : "+Arrays.toString(arr));
		findNthMaxNumberinArray_A28_2.findNthMaxNumber(arr, 4);
		findNthMaxNumberinArray_A28_2.findNthMaxNumber(arr, 2);
		findNthMaxNumberinArray_A28_2.findNthMaxNumber(arr, 3);
		findNthMaxNumberinArray_A28_2.findNthMaxNumber(arr, -3);
	}
}

