/*Program 2: place all negative numbers at the beginning and all positive numbers at the end.
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]*/
package indu.Assignment_33;

import java.util.Arrays;

public class ShiftAllPositivenumbersAtEnd_33_2 {

	void shiftPositiveNumAtEnd(int [] arr)
	{
		int count =0;
		int[] output = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				output[count]=arr[i];
				count++;
			}
			
		}
		int outIndex=count;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=0) {
			output[outIndex]=arr[i];
			outIndex++;}
		}
		
		System.out.println("OutPut is :\n "+Arrays.toString(output));
	}
	public static void main(String[] args) {
		ShiftAllPositivenumbersAtEnd_33_2 a33_2 = new ShiftAllPositivenumbersAtEnd_33_2();
		int [] input = {1,-3,-2,11,44,55,-76,33,12};
		System.out.println("Input Arrya to shift All positive numbers at is \n "+Arrays.toString(input));
		a33_2.shiftPositiveNumAtEnd(input);
	}
}
