//find the triple which in sequence and having maximum sum


package nishi.Assignment33;

import java.util.Arrays;

public class Assignment33D {
	
	int[] getTriplet(int[] a)
	{
		int sum=0;
		int max=0;
		int[] a1=new int[3];
		for(int i=0;i<a.length-2;i++)
		{
			if(a[i]+1==a[i+1] && a[i+1]+1 ==a[i+2])
			{								
				sum=a[i]+a[i+1]+a[i+2];
				if(sum>max)
				{
					max=sum;
					for(int j=0;j<a1.length;j++)
					{
						a1[j]=a[i+j];
					}
					
				}
			}
		}
		
		return a1;
	}
	
	public static void main(String[] args) {
		int[] a= {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
		int[] a1=new Assignment33D().getTriplet(a);
		System.out.println(Arrays.toString(a1));
	}
	
}
