package nishi.SocdingTest4_5;

import java.util.Arrays;

public class ScodingTest4 {
	
	int[] getShiftedZero(int[] input)
	{
		int[] output=new int[input.length];
		int count=0;
		for(int i=0;i<input.length;i++)
		{
			if(input[i]!=0)
			{
				output[count]=input[i];
				count++;
			}			
		}
		return output;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,0,0,6,0,2,3,0,4,0,5};
		int[] output=new ScodingTest4().getShiftedZero(arr);
		System.out.println(Arrays.toString(output));
	}

}
