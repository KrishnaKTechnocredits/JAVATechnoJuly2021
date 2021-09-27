package arti_G_Assignment32;

import java.util.Arrays;

/*Assignment - 32 : 10th Sep'2021

Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25
       24,25,26
	   64,65,66 -> having max sum*/
public class TripletSequence {

	void getTripletSeguence(int[] input) {
		int maxSum=0;
		int n1=0,n2=0,n3=0;
		for(int index=0;index<input.length-2;index++) {
			if(input[index+1] == input[index]+1 && input[index+2]==input[index+1]+1) {
				int sum = input[index]+input[index+1]+input[index+2];
				if(maxSum<sum) {
					maxSum=sum;
					n1=input[index];
					n2=input[index+1];
					n3=input[index+2];
				}
			}
		}
		System.out.println("Triplets are - "+ n1 +" "+n2+ " "+n3);
		System.out.println("Sum of triplets = "+maxSum);
	}
	public static void main(String[] args) {
		TripletSequence s1 = new TripletSequence();
		int[] arr = {10,64,65,66,23,24,25,26,61,62};
		System.out.println("Triplets sequence array "+ Arrays.toString(arr));
		s1.getTripletSeguence(arr);
	}
}
