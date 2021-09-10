package akshay;

import java.util.Arrays;

public class Test_4 {
	
	int[] sperateZero(int[] arr) {
		int[] output =  new int[arr.length-1];
		int i = 0;
		for(int index = 0; index < arr.length; index++) {
			if(arr[index] > 0) {
				output[i] = arr[index];
				i++;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Test_4 test4 = new Test_4();
		int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
		int[] output = test4.sperateZero(arr);
		System.out.println("Output: "+Arrays.toString(output));
	}
}
