package suchita;

//Assignment 33

import java.util.Arrays;
class Assignment33 {
	
	//Shift all non zeros at the end.
	void shiftNonZerosAtEnd(int[] input) {
		
		int[] output = new int[input.length];
		int count=0;
		int i = 0;
		
		System.out.println("Input array :: " + Arrays.toString(input));
		
		
		for(int index=0; index<input.length; index++) {
			if(input[index]==0)
				count++;
		}
		 i = count;
		for(int index=0; index<input.length; index++) {
			if(input[index]!=0) {
				output[i] = input[index];
				i++;
			}
		}
		System.out.println("Output array :: " + Arrays.toString(output));
	}
	
	//Place all negative numbers at the beginning and all positive numbers at the end.
	void getAllNegativeAtBeginning(int[] input) {
		
		int[] output = new int[input.length];
		int i = 0;
		
		System.out.println("\nInput array :: " + Arrays.toString(input));
		
		for(int index=0; index<input.length; index++) {
			if(input[index]<0) {
				output[i]=input[index];
				i++;
			}
		}
		for(int index=0; index<input.length; index++) {
			if(input[index]>0) {
				output[i] = input[index];
				i++;
			}
		}
		System.out.println("Output array :: " + Arrays.toString(output));
	}
	
	//Place all negative numbers at the beginning ,zeros and all postive numbers at the end. 
	void getAllNegativeAndZerosAtBeginning(int[] input) {
		
		int[] output = new int[input.length];
		int i = 0;
		int j = 0;
		
		System.out.println("\nInput array :: " + Arrays.toString(input));
		
		for(int index=0; index<input.length; index++) {
			if(input[index] < 0) {
				output[i] = input[index];
				i++;
			}
			else if(input[index] == 0)
				j++;
		}
			i += j;
		for(int index=0; index<input.length; index++) {
			if(input[index]>0) {
				output[i] = input[index];
				i++;
			}
		}System.out.println("Output array :: " + Arrays.toString(output));
	}
	
	//Find the triplet which in sequence and having maximum sum.
	void getTriplets(int[] input) {
		
		int num, sum, max=0, maxSum=0;
		int[] output = new int[3];
		for(int index=0; index<input.length-2; index++) {
			sum=0;
			num = input[index];
			if((num+1) == input[index+1]) {
				if((num+2) == input[index+2]) {
					sum = num + (num+1) + (num+2);
				}
				if(maxSum<sum) {
					maxSum=sum;
					max = index;
					
				}
			}
		}
		int count =0;
		for (int index = max; index < max + 3; index++) {
			output[count] = input[index];
			count++;
		}
		System.out.println(Arrays.toString(output)+ " triplet have maximum sum of :: "+maxSum);
	}
	
		
	public static void main(String[] args) {
		
		Assignment33 assignment = new Assignment33();
		int[] input = {1,0,3,4,0,2,88,0,22,34};
		assignment.shiftNonZerosAtEnd(input);
		int[] input1 = {1,-3,-2,11,44,55,-76,33,12};
		assignment.getAllNegativeAtBeginning(input1);
		int[] input2 = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
		assignment.getAllNegativeAndZerosAtBeginning(input2);
		int[] input3 = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
		assignment.getTriplets(input3);
	}
}