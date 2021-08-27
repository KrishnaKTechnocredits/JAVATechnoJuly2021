package gauravk.Assignment_14;
/*
 * Assignment 14 : 15th Aug'2021


program 1 : find maximum number from given array.

int[] input = {1,11,44,23,55,99,23};
output : 99

program 2 : find minimum number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 11


program 3 : print difference between max and min number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 98


program 4 : print difference between max odd number and max even number from given array. difference should be positive

int[] input = {1,11,44,23,55,99,23,22};
hint : 99 - 44
output : 55
 */
public class FindMaxNumFromArray {
	
	int maxNumFromArray(int[] arr) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max)
				max=arr[i];
			else max=max;
		}
		return max;
	}
	
	public static void main(String[] a) {
		int[] input = {1,11,44,23,55,99,23};
		System.out.println("The maximum number from array is "+new FindMaxNumFromArray().maxNumFromArray(input));
	}
}
