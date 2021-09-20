/*program 1 : place 0 after the triple which in sequence.


input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14
output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];

		 
program 2 : place sum of triple after each triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
output = [1,3,4,5,12,7,3,9,10,11,30,14,44,67,1,2,3,6,99];*/
package indu.Assignment_34;

import java.util.Arrays;

public class placeZeroAfterEverySequenceInArray_33_1_2 {
	
	 void setZeroAfterTriplet(int[] input) 
	 {
			int index;
			int count=0;
			int outIndex=2;
			int length = input.length;
			for(index=0;index<input.length-2;index++) 
			{
				if(input[index+1]==input[index]+1 && input[index+2]==input[index+1]+1)
					count++;
			}
			int[] arr =new int[count+length];
			arr[0]=input[0];
			arr[1]=input[1];
			
			for(index=2;index<input.length;index++)
			{
				arr[outIndex++]=input[index];
				if(input[index-1]==input[index-2]+1 && input[index]==input[index-1]+1) 
					arr[outIndex++]=0;
			}


			System.out.println("\nThe array with Zer0 after triplet SEquence is :"+Arrays.toString(arr));
		}

		 void setSumAfterTriplet(int[] input) {
			int index;
			int count=0;
			int outIndex=2;
			int length = input.length;
			for(index=0;index<input.length-2;index++) 
			{
				if(input[index+1]==input[index]+1 && input[index+2]==input[index+1]+1) 
					count++;
			}
			int[] arr =new int[count+length];
			arr[0]=input[0];
			arr[1]=input[1];
			for(index=2;index<input.length;index++)
			{
				arr[outIndex++]=input[index];
				if(input[index-1]==input[index-2]+1 && input[index]==input[index-1]+1) 
					arr[outIndex++]=input[index]+input[index-1]+input[index-2];
			}

				System.out.println("\nThe  array with Sum after triplet sequence is :"+Arrays.toString(arr));
		}
	
	
	public static void main(String[] args) {
		placeZeroAfterEverySequenceInArray_33_1_2 a34 = new placeZeroAfterEverySequenceInArray_33_1_2();
		int[] input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		
		System.out.println("The input Array is : "+Arrays.toString(input));
		a34.setZeroAfterTriplet(input);
		System.out.println("\n===================================================================================================================");
		a34.setSumAfterTriplet(input);
	}
}
