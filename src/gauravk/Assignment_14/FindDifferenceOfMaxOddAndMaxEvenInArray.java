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
public class FindDifferenceOfMaxOddAndMaxEvenInArray {
	
	int oddCounts=0;
	int evenCounts=0;
	
	void extractOddEvenCounts(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0)
				oddCounts++;
			evenCounts++;
		}
	}
	
	int[] extractOdd(int[] arr) {
		int[] odds = new int[oddCounts];
		for(int i=0, j=0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				odds[j]= arr[i];
				j++;
			}
		}
		return odds;
	}
	
	int[] extractEven(int[] arr) {
		int[] evens = new int[evenCounts];
		for(int i=0, j=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				evens[j]= arr[i];
				j++;
			}
		}
		return evens;	
	}	
	
	public static void main(String[] a) {
		int[] input = {1,11,44,23,55,99,23,22};
		FindDifferenceOfMaxOddAndMaxEvenInArray diffMaxOfOddAndEven = new FindDifferenceOfMaxOddAndMaxEvenInArray();
		FindMaxNumFromArray mx = new FindMaxNumFromArray();
		
		diffMaxOfOddAndEven.extractOddEvenCounts(input);

		int[] oddArray = new int[diffMaxOfOddAndEven.oddCounts];
		oddArray = diffMaxOfOddAndEven.extractOdd(input);
		int maxOdd = mx.maxNumFromArray(oddArray);

		int[] evenArray = new int[diffMaxOfOddAndEven.evenCounts];
		evenArray = diffMaxOfOddAndEven.extractEven(input);
		int maxEven = mx.maxNumFromArray(evenArray);
		
		int result=0;
		if(maxOdd>maxEven)
			result= maxOdd-maxEven;
		else result = maxEven-maxOdd;
		System.out.println("The positive difference between MaxOdd and MaxEven number from array is "+result);
	}
}