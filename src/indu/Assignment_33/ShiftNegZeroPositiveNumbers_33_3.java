/*program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.

input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]*/
package indu.Assignment_33;

import java.util.Arrays;

public class ShiftNegZeroPositiveNumbers_33_3 {
	void shiftPositiveNumAtEnd(int [] arr)
	{
		int zeroCount=0;
		int count =0;
		int[] output = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				output[count]=arr[i];
				count++;
			}
			
			if(arr[i]==0)
			{
				zeroCount++;
			}
			
		}
		int outIndex=count+zeroCount;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0) 
			{
			output[outIndex]=arr[i];
			outIndex++;
			}
		}
		
		System.out.println("OutPut is :\n "+Arrays.toString(output));
	}
	public static void main(String[] args) 
	{
		ShiftNegZeroPositiveNumbers_33_3 a33_3 = new ShiftNegZeroPositiveNumbers_33_3();
		int[] input= {1,-3,0,-2,11,0,44,55,-76,33,0,12};
		System.out.println("Input Arrya to place first negative then zero then  positive numbers at is \n "+Arrays.toString(input));
		a33_3.shiftPositiveNumAtEnd(input);
	}
}
