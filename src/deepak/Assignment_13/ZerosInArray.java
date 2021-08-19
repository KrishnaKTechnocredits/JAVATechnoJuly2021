//Assignment 13 [Program 2]-[Count of Zeros in Array] DATE: 08/15
package deepak.Assignment_13;

public class ZerosInArray {
	int zeroCount;
	
	int getNumberOfZeros(int[] array) {
		for(int i = 0; i < array.length ; i++) {
			if(array[i]==0) {
				zeroCount++;
			}
		}System.out.print("Count of zero in the array is: ");
		return zeroCount;
	}
	
	public static void main(String[] args) {
		int[] input = {1,-11,0,0,55,0,-23,0};
		ZerosInArray zeroInArray=new ZerosInArray();
		System.out.println(zeroInArray.getNumberOfZeros(input));
	}
}
