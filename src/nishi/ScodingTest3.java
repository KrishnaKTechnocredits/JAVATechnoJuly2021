package nishi;

import java.util.Arrays;

public class ScodingTest3 {
	
	int[] getArraysAfterDeletionOfElement(int[] input,int num)
	{	
		int temp=0;
		int[] output=new int[input.length-1];
		for(int i=0,j=0;i<input.length && j<output.length;i++,j++)
		{
			if(input[i]==num)
			{		
				temp=input[i+1];
				input[i+1]=input[i];
				input[i]=temp;
				output[j]=input[i];
			}
			else
			{
				output[j]=input[i];
			}
		}
		return output;
	}
	
	

	public static void main(String[] args) {
		int[] input= {25,14,56,15,36,56,77,18,29,49};		
		int num=14;
		System.out.println("After deleting "+num+ " from "+ Arrays.toString(input));
		int[] output=new ScodingTest3().getArraysAfterDeletionOfElement(input, num);
		System.out.println("The new arrray is :"+Arrays.toString(output));

	}

}
