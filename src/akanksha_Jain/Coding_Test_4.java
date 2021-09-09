package akanksha_Jain;

import java.util.Arrays;

public class Coding_Test_4 {

	void shiftZerosInLast(int[] arr) {
		int count=0;
		int[] output = new int[arr.length];
		for(int index=0; index<arr.length; index++) {
			if(arr[index]!=0) {
				output[count] = arr[index];
				count ++;
			}
		}
		System.out.println(Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
		Coding_Test_4 codingTest4 = new Coding_Test_4();
		codingTest4.shiftZerosInLast(arr);
	}
}