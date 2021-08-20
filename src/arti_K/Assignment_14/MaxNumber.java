/*  program 1 : find maximum number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 99  */

package arti_K.Assignment_14;

public class MaxNumber {
	
	void findMaxnumber(int[] arr) {
		int max = 0;
		for(int index = 0; index < arr.length; index++) {
			if(arr[index] > max) {
				max = arr[index];
			}
		}
		System.out.println("Maximum number from array : "+max);
	}
	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23};
		MaxNumber maxnum = new MaxNumber();
		maxnum.findMaxnumber(input);
	}
}
