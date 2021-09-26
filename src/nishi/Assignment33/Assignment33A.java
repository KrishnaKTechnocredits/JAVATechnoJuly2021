package nishi.Assignment33;

//Program 1 : shift all non zeros at the end.
import java.util.Arrays;

public class Assignment33A {
	
	int[] shiftAllNinZerosAtEnd(int[] a)
	 {
		int[] output=new int[a.length];	
		int zeroCnt=0;
		for(int i=0;i<a.length;i++)
		{			
			if(a[i]==0)
				zeroCnt++;
			
		}
		
		for(int j=0;j<a.length;j++)
		{
			if(a[j]!=0)
			{
				output[zeroCnt]=a[j];
				zeroCnt++;
			}
		}
		 
		 
		return output;
	 }
	
	public static void main(String[] args) {
		int[] a= {1,0,3,4,0,2,88,0,0,22,34};
		int[] output=new Assignment33A().shiftAllNinZerosAtEnd(a);
		System.out.println(Arrays.toString(output));
	}
}
