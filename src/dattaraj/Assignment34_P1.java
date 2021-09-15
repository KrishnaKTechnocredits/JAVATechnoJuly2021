package dattaraj;

import java.util.Arrays;

public class Assignment34_P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		Assignment34_P1 p1 = new Assignment34_P1();
		p1.addZeroAfterTripleSeq(input);
	}
	
	int getTripleSeqCount(int[] arr) {
		int count=0;
		for(int index=0; index<arr.length-2; index++) {
			if(arr[index+1]==arr[index]+1 && arr[index+2]==arr[index+1]+1) {
				count ++;
			}
		}
		return count;
	}
	
	void addZeroAfterTripleSeq(int[] arr) {
		int[] output = new int[arr.length+getTripleSeqCount(arr)];
		int outputIndex = 2;
		output[0]=arr[0];
		output[1]=arr[1];
		for(int index=2;index<arr.length;index++) {
			output[outputIndex++]=arr[index];
			if(arr[index-1]==arr[index-2]+1 && arr[index]==arr[index-1]+1) 
				output[outputIndex++]=0;
		}
    	System.out.println("adding zero after triplets output array is as :" +Arrays.toString(output));
	}

}
