package dattaraj;

import java.util.Arrays;

public class Scoding_Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
		Scoding_Test4 test4 = new Scoding_Test4();
		test4.shiftZerosInLast(arr);
	}

	void shiftZerosInLast(int[] arr) {
		int count = 0;
		int[] output = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
            	output[count] = arr[i];
				count ++;   
            }
        }
                
        System.out.println("Array after pushing zeros to the end: ");
        System.out.println("Output is " + Arrays.toString(output));	
	}
	
}
