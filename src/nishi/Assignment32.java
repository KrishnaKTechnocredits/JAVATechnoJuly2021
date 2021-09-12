package nishi;

import java.util.Arrays;

public class Assignment32 {
	
	int[] getCountOfThreeConsecutive(int a[])
	{	
		int max=0;
		int sum=0;
		int[] input=new int[3];
		for(int i=0;i<a.length-2;i++)
		{			
			if(a[i]+1==a[i+1] && a[i+1]+1==a[i+2])
			{					
				sum=a[i]+a[i+1]+a[i+2];			
				if(sum>max)
				{
					max=sum;
					for(int j=0;j<3;j++)
					{
						input[j]=a[i+j];					
					}
					
				}				
			}
		}

		return input;
	}
	
	public static void main(String[] args) {
		int[] arr= {10,64,65,66,23,24,25,26,61,62};
		System.out.println(Arrays.toString(new Assignment32().getCountOfThreeConsecutive(arr)));
	}

}
