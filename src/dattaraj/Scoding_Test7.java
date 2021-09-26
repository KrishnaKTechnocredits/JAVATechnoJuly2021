package dattaraj;

import java.util.Arrays;

public class Scoding_Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 10,9,11,6,23,25,22,66,34 };
		Scoding_Test7 test7 = new Scoding_Test7();
		test7.getTripletCntInc(input);
	}

	 void getTripletCntInc(int[] arr) {
		// TODO Auto-generated method stub
		int[] output = new int[3];
		for(int index=0; index<arr.length-2; index++) {
			if(arr[index]<arr[index+1]) {
				if(arr[index+1]<arr[index+2]) {
					output[0] = arr[index];
					output[1] = arr[index+1];
					output[2] = arr[index+2];
				}
			}
		}
		System.out.println(Arrays.toString(output) + " is a triplet in increasing order");
	}

}
