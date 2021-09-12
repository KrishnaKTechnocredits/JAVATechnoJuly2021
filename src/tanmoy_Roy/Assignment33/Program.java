/*
 * Assignment - 33 : 11th Sep'2021

Program 1 : shift all non zeros at the end.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]

Program 2: place all negative numbers at the beginning and all positive numbers at the end.
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]

program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]

program 4 : find the triple which in sequence and having maximum sum

input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12
 */

package tanmoy_Roy.Assignment33;

import java.util.Arrays;

public class Program {
	
	void shiftZerosToFirst(int[] input) {
		int i,zerosCount=0,n=input.length;
		int[] arr= new int[n];
		for(i=0;i<n;i++)
			if(input[i]==0)
				zerosCount++;
		for(i=0;i<n;i++)
			if(input[i]!=0)
				arr[zerosCount++]=input[i]; //arr[index<zerosCount] will be zeros
		System.out.println("The reaaranged array is :"+Arrays.toString(arr));
	}
	
	void countIncreasingTriplets(int[] input) {
		int i,a=0,b=0,c=0,maxSum=0;
		for(i=0;i<input.length-2;i++) 
			if(input[i+1]==input[i]+1 && input[i+2]==input[i+1]+1 && maxSum<input[i]+input[i+1]+input[i+2]) {
				a=input[i];
				b=input[i+1];
				c=input[i+2];
				maxSum=a+b+c;
		}
		System.out.println("The Triplets which is in sequence and Max sum are "+ a+","+b+","+c);
	}
	
	void shiftNegativesToFirst(int[] input) {
		int i,countNeg=0,n=input.length,k=0;
		int[] arr= new int[n];
		for(i=0;i<n;i++)
			if(input[i]<0)
				countNeg++;
		for(i=0;i<n;i++)
			if(input[i]>0)
				arr[countNeg++]=input[i];  
			else
				arr[k++]=input[i];
				
		System.out.println("The reaaranged array is :"+Arrays.toString(arr));
	}
	
	void shiftNegativesAndZerosToFirst(int[] input) {
		int i,countNeg=0,n=input.length,zerosCount=0;
		int[] arr= new int[n];
		for(i=0;i<n;i++)
			if(input[i]<0)
				countNeg++;
			else if(input[i]==0)
				zerosCount++;
		int k=zerosCount+countNeg,x=0;
		for(i=0;i<n;i++)
			if(input[i]>0)
				arr[k++]=input[i];  
			else if(input[i]<0)
				arr[x++]=input[i];
				
		System.out.println("The reaaranged array is :"+Arrays.toString(arr));
	}

	public static void main(String[] args) {
		Program prg = new Program();
		int[] input1= {1,0,3,4,0,2,88,0,0,22,34};
		prg.shiftZerosToFirst(input1);
		int[] input2 = {1,-3,-2,11,44,55,-76,33,12};
		prg.shiftNegativesToFirst(input2);
		int[] input3 = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
		prg.shiftNegativesAndZerosToFirst(input3);
		int[] input4={1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
		prg.countIncreasingTriplets(input4);

	}

}
