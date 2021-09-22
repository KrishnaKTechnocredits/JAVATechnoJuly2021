package siddharth;

import java.util.Arrays;

public class Assignment33_2 {
	int[] shiftAllPositiveAtEnd(int[] a)
	 {
	 int[] output=new int[a.length];	
	 int negativeCnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				output[negativeCnt]=a[i];	
				negativeCnt++;					
			}			

		}

		for(int j=0;j<a.length;j++)
		{
			if(a[j]>0)
			{
			output[negativeCnt]=a[j];
			negativeCnt++;
			}

		}
		return output;
	 }

	public static void main(String[] args) {
		int[] a= {1,-3,-2,11,44,55,-76,33,12};
		int[] output=new Assignment33_2().shiftAllPositiveAtEnd(a);
		System.out.println(Arrays.toString(output));
	}
}
