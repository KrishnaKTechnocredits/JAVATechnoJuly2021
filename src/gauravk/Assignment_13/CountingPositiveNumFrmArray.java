package gauravk.Assignment_13;

/*
 * Assignment 13 : 15th Aug'2021

program 1 : return count of positive numbers from given array.
int[] input = {1,-11,-44,23,55,-99,-23,-22};
output : 3

 */

public class CountingPositiveNumFrmArray {
	
	int countOfPositives(int[] arr) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if (arr[i]>=0)
				count++;
		}
		return count;
	}
	
	public static void main(String[] a) {
		int[] input = {1,-11,-44,23,55,-99,-23,-22};
		System.out.println("Total positive numbers from array is "+new CountingPositiveNumFrmArray().countOfPositives(input));
	}
}