package swati.Assignment33;

import java.util.Arrays;

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
public class Assignment33 {
	
	void shifZeroAtEnd(int[] input) {
		int[] output=new int[input.length];
		int tempIndex=0;
		for(int index=0;index<input.length;index++) {
			if(input[index]==0) {
				output[tempIndex++]=input[index];
				}
			
			}
		 for(int index2=0;index2<input.length;index2++) {
			 if(input[index2]!=0){
				 output[tempIndex++]=input[index2];				 	 
			 }
		 }
	 System.out.println("Output:"+Arrays.toString(output));
	}
	
	void placeNegtvThenPositive(int[] input) {
		int[] output=new int[input.length];
		int tempIndex=0;
		for(int index=0;index<input.length;index++) {
			if(input[index]<0) {
				output[tempIndex++]=input[index];
				}
			
			}
		 for(int index2=0;index2<input.length;index2++) {
			 if(input[index2]>=0){
				 output[tempIndex++]=input[index2];				 	 
			 }
		 }
	 System.out.println("Output:"+Arrays.toString(output));
	}
	
	void placeNegtvZeroPositive(int[] input) {
		int[] output=new int[input.length];
		int tempIndex=0;
		int zeroCount=0;
		for(int index=0;index<input.length;index++) {
			if(input[index]<0) {
				output[tempIndex++]=input[index];
				}
			else if(input[index]==0) {
				zeroCount++;
			}
			
		}
		tempIndex=tempIndex+zeroCount;
		
		 for(int index2=0;index2<input.length;index2++) {
			 if(input[index2]>0){
				 output[tempIndex++]=input[index2];				 	 
			 }
		 }
	 System.out.println("Output:"+Arrays.toString(output));
	}
	
	public static void main(String[] a) {
		Assignment33 a1=new Assignment33();
		int[] input={1,0,3,4,0,2,88,0,0,22,34};
		a1.shifZeroAtEnd(input);
		int[] input2 = {1,-3,-2,11,44,55,-76,33,12};
		a1.placeNegtvThenPositive(input2);
		int[] input3 = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
		a1.placeNegtvZeroPositive(input3);
	}

}
