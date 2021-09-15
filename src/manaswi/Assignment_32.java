package manaswi;

import java.util.Arrays;

public class Assignment_32 
{

	boolean findConsecutive(int num1, int num2, int num3)
	{
		if (num2 == num1 + 1 && num3 == num2 + 1)
			return true;
		return false;

	}

	void loopArray(int arr[])
	{

		int sum = 0;
		int maxSum = 0;
		int maxIndex = 0;

		for (int index = 0; index < arr.length; index++)
		{
			if (index + 2 < arr.length)
				if (findConsecutive(arr[index], arr[index + 1], arr[index + 2]))
				{
					sum = arr[index] + arr[index+1] + arr[index+2];
					if(sum>maxSum) {
						maxSum = sum;
						maxIndex = index;
					}
				}
		}
		System.out.println(
				+arr[maxIndex]+", "+arr[maxIndex+1]+", "+arr[maxIndex+2]+ 
				" \n  This is triple in given array  " + Arrays.toString(arr) + " has max count " + maxSum);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Assignment_32 sum = new Assignment_32();
		int arr[] = { 10, 64, 65, 66, 23, 24, 25, 26, 61, 62 };
		sum.loopArray(arr);

	}

}