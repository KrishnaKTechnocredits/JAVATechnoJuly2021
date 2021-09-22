//place all negative numbers at the beginning, 
//zeros and all positive numbers at the end.
package nishi.Assignment33;

import java.util.Arrays;

public class Assignment33C {
	
	int[] shiftAllPositiveAtEnd(int[] a)
	 {
	 int[] output=new int[a.length];	
	 int negativeCnt=0;
	 int zeroCnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				output[negativeCnt]=a[i];
				negativeCnt++;
			}
			else if(a[i]==0)
			{
				zeroCnt++;
			}
			
		}
		 int positiveStartIndex=negativeCnt+zeroCnt;
		for(int j=0;j<a.length;j++)
		{
			if(a[j]>0)
			{
			output[positiveStartIndex]=a[j];
			positiveStartIndex++;
			}
			
		}
		return output;
	 }
	
	public static void main(String[] args) {
		int[] a= {1,-3,0,-2,11,0,44,55,-76,33,0,12};
		int[] output=new Assignment33C().shiftAllPositiveAtEnd(a);
		System.out.println(Arrays.toString(output));
	}

}
