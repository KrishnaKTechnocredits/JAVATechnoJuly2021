package tarangAssignment34;

import java.util.Arrays;

/*Assignment - 34 : 11th Sep'2021
program 1 : place 0 after the triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14
output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];*/
public class Triplet {

	void setZeroInTriplet(int[] input) {
		int index;
		int count=0;
		int outIndex=2;
		int length = input.length;
		for(index=0;index<input.length-2;index++) {
			if(input[index+1]==input[index]+1 && input[index+2]==input[index+1]+1)
				count++;
		}
		int[] arr = new int[count+length];
		arr[0]=input[0];
		arr[1]=input[1];
		for(index=2;index<input.length;index++) {
			arr[outIndex++]=input[index];
			if(input[index-1]==input[index-2]+1 && input[index]==input[index-1]+1)
				arr[outIndex++]=0;
		}
		System.out.println("Set zero after triplet sequence is :"+Arrays.toString(arr));
		
	}
	public static void main(String[] args) {
		Triplet t1 = new Triplet();
		int[] input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		System.out.println("The input Array is : "+ Arrays.toString(input));
		t1.setZeroInTriplet(input);
	}

}
