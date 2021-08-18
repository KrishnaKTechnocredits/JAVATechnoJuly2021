package gauravk.Assignment_13;
/*
 * Assignment 13 : 15th Aug'2021

program 3 : write a method which returns 5 smaller numbers of the given number.
input : 50
output : 49, 48, 47, 46, 45
 */

public class FiveConsecutiveSmallerNum {
	
	int[] fiveConsecSmallNums(int arr) {
		int[] output = new int[5];
		for(int i=0; i<output.length; i++) {
			output[i] = --arr;
		}
		return output;
	}
	
	public static void main(String[] a) {
		int input = 50;
		FiveConsecutiveSmallerNum fiveConsecutiveSmallerNum1 = new FiveConsecutiveSmallerNum();
		int[] nums = new int[5];
		nums = fiveConsecutiveSmallerNum1.fiveConsecSmallNums(input);
		System.out.print("Five smaller consecutive numbers of a given number "+input+" are ");
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
}